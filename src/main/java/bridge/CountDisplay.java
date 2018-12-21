package bridge;

public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	/**
	 * 做多次显示处理
	 * @param times 次数
	 */
	public void multiDisplay(int times) {
		open();
		for(int i=0;i<times;i++) {
			print();
		}
		close();
	}
}
