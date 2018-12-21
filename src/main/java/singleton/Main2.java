package singleton;

/**
 * 在多线程几乎同时调用Singleton.getInstance()方法时，可能会生成多个实例【不一样的实例】
 * 这就失去了单例模式的核心意义了
 * @author fhzheng
 *
 */
public class Main2 extends Thread{
	
	public Main2(String name) {
		super(name);
	}
	
	public void run() {
		Singleton obj = Singleton.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}

	public static void main(String[] args) {
		System.out.println("做了线程同步，跑出来肯定是单例");
		System.out.println("Start...");
		new Main2("A").start();
		new Main2("B").start();
		new Main2("C").start();
		new Main2("D").start();
		new Main2("E").start();
		new Main2("F").start();
		new Main2("G").start();
		new Main2("H").start();
		System.out.println("End...");		
	}
}
