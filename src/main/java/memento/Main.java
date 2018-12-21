package memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import memento.game.Gamer;
import memento.game.Memento;

public class Main {
	
	public static final String SAVEFILENAME = "game.dat";

	public static void main(String[] args) {

		//初态
		Gamer gamer = new Gamer(100);
		//快照一下
		//Memento memento = gamer.createMemento();
		
		//从文件中读取起始状态，不一定成功，因为第1次时，没有这个文件
		//Memento memento = loadMemento();
		//从压缩文件中读取，可能出错，因为它可能不是压缩格式
		Memento memento = loadInflaterMemento();
		
		
		if (memento != null) {
			System.out.println("读取上一次保存存档开始游戏。。。");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("新游戏开始。。。");
			memento = gamer.createMemento();
		}
		
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
				//并保存到文件[普通方式]
				//saveMemento(memento);
				//并保存到文件[压缩方式]
				saveDeflateMemento(memento);
			} else if (gamer.getMoney() < memento.getMoney()) {		//损则复原
				System.out.println("     (所持金钱减少了许多，因此将游戏恢复至以前的状态)");
				gamer.restoreMemento(memento);
			}
			
			//系统等待
			try {
				Thread.sleep(50);
			} catch (Exception e) {
			}
			System.out.println();
		}
	}

	/**
	 * 将纪念品保存到文件
	 * @param memento 将要保存的纪念品
	 */
	public static void saveMemento(Memento memento) {
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 从保存的文件中加载纪念品
	 * @return 最后保存的纪念品
	 */
	public static Memento loadMemento() {
		Memento memento = null;
		try {
			ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			memento = (Memento)in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return memento;
	}

	/**
	 * 以压缩方式保存纪念品到文件
	 * @param memento 纪念品
	 */
	public static void saveDeflateMemento(Memento memento) {
		try {
			//ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			ObjectOutput out = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVEFILENAME)));
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从压缩方式保存的文件中加载纪念品
	 * @return 最后保存的纪念品
	 */
	public static Memento loadInflaterMemento() {
		Memento memento = null;
		try {
			//ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			ObjectInput in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILENAME)));
			memento = (Memento)in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return memento;
	}
}
