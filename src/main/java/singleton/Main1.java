package singleton;

/**
 * 在多线程几乎同时调用Singleton.getInstance()方法时，可能会生成多个实例【不一样的实例】
 * 这就失去了单例模式的核心意义了
 * @author fhzheng
 *
 */
public class Main1 extends Thread{
	
	public Main1(String name) {
		super(name);
	}
	
	public void run() {
		Singleton2 obj = Singleton2.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}

	public static void main(String[] args) {
		System.out.println("未做线程同步，跑出来可能不是单例");
		System.out.println("Start...");
		new Main1("A").start();
		new Main1("B").start();
		new Main1("C").start();
		new Main1("D").start();
		new Main1("E").start();
		new Main1("F").start();
		new Main1("G").start();
		new Main1("H").start();
		System.out.println("End...");		
	}
}
