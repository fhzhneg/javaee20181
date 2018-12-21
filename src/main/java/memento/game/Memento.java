package memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	int money;			//所持金币
	ArrayList fruits;	//获得水果
	
	/**
	 * 获得金币
	 * @return 金币数
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * 构造记忆模式
	 * @param money 金币数
	 */
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}
	
	/**
	 * 添加水果
	 * @param fruit 水果
	 */
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	/**
	 * 获取当前所持有的水果
	 * @return 水果列表
	 */
	List getFruits() {
		return (List)fruits.clone();
	}
}
