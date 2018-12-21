package memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

	private int money;							//金币数
	private List fruits = new ArrayList();		//水果
	
	private Random random = new Random();		//随机数生成器
	
	/**
	 * 水果种类
	 */
	private static String[] fruitsname = {
		"苹果","葡萄","香蕉","李子","桃子","菠萝",	
	};
	
	/**
	 * 构造函数
	 * @param money
	 */
	public Gamer(int money) {
		this.money = money;
	} 
	
	/**
	 * 获取金币
	 * @return 金币
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * 进行投掷骰子的游戏
	 */
	public void bet() {
		int dice = random.nextInt(6)+1;					//投出
		if(dice == 1) {									//赢了，增加金币
			money += 100;
			System.out.println("所持金币增加了。");
		} else if (dice == 2) {							//输出，金币减少
			money /=2;
			System.out.println("所持金币减半了。");
		} else if (dice == 6) {							//获得水果，运气
			String f = getFruit();
			System.out.println("获得了水果("+f+")。");
			fruits.add(f);
		} else {										//3,4,5啥也没发生
			System.out.println("什么都没有发生。");
		}
	}
	
	/**
	 * 拍摄快照
	 * @return 快照
	 */
	public Memento createMemento() {
		
		Memento m = new Memento(money);					//金币数记录
		Iterator it = fruits.iterator();
		while (it.hasNext()) {							//水果记录
			String f = (String)it.next();
			if (f.startsWith("好吃的")) {					//只保存好吃的水果
				m.addFruit(f);
			}
		}
		return m;
	}
	
	/**
	 * 快照恢复，即撤销
	 * @param memento 传入快照
	 */
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	/**
	 * 用字符串表示主人公当状态
	 * 即输出金币数和水果列表
	 */
	public String toString() {
		return "[money = "+money+", fruits = "+fruits+"]";
	}
	
	/**
	 * 获得一个水果
	 * @return 好吃的XX[水果]
	 */
	private String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "好吃的";
		}
		return prefix+fruitsname[random.nextInt(fruitsname.length)];
	}
}
