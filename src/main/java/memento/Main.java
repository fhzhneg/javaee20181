package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class Main {

	public static void main(String[] args) {

		//初态
		Gamer gamer = new Gamer(100);
		//快照一下
		Memento memento = gamer.createMemento();
		
		//游戏开始
		for (int i = 0; i < 100; i++) {
			System.out.println("==== "+i);			//游戏次数
			System.out.println("当前状态："+gamer);	//当前态

			gamer.bet();							//进行游戏
			
			System.out.println("所有金币为：" + gamer.getMoney()+"个。");
			
			//如何处理Memento，即使用记忆
			if (gamer.getMoney() > memento.getMoney()) {			//优则存
				System.out.println("     (所持金钱增加了许多，因此保存游戏当前的状态)");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney()) {		//损则复原
				System.out.println("     (所持金钱减少了许多，因此将游戏恢复至以前的状态)");
				gamer.restoreMemento(memento);
			}
			
			//系统等待
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			System.out.println();
		}
	}
}
