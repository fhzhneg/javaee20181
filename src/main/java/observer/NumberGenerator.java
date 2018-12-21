package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 抽象对象，用于产生数字，并通知观察者
 * @author fhzheng
 *
 */
public abstract class NumberGenerator {

	/**
	 * 可能会有很多个（种）观察者
	 * 建议观察者列表
	 */
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 向Observer发通知
	 */
	public void notifyObserver() {
		
		Iterator iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer o = (Observer)iterator.next();
			o.update(this);
		}
	}
	
	/**
	 * 获取数字
	 * @return 一个数字
	 */
	public abstract int getNumber();
	
	/**
	 * 用随机方式产生5个1-80的随机数
	 * 数字生成器
	 */
	public abstract void execute();
}
