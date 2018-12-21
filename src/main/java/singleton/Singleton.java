package singleton;

public class Singleton {

	private static Singleton singleton = null;
	
	/**
	 * 私有化构造函数，确保只生成一个实例，外部无法new
	 * 
	 */
	private Singleton() {
		System.out.println("生成了一个实例");
		//测试时才用，非测试时，请关闭以下语句
		slowdown();
	}
	
	/**
	 * 严格严谨的单例模式，即Singleton模式
	 * 要启用线程同步，确保单例
	 * 方便外部访问
	 * @return 返回一个Singleton实例
	 */
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	/**
	 * 测试时用，不测试时，请关闭
	 */
	public void slowdown() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}
