package singleton;

public class Singleton2 {

	private static Singleton2 singleton2 = null;
	
	private Singleton2() {
		System.out.println("创建了一个实例");
		slowdown();
	}
	
	/**
	 * 不严格的，不严谨的Singleton模式
	 * 未做线程同步
	 * @return
	 */
	public static Singleton2 getInstance() {
		//这里的判断是引发线程不安全的因素
		//因为在赋值之前，其它的线程可能会进行singleton == null的判断
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

	/**
	 * 为了演示，降速处理
	 */
	private void slowdown() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
	
}
