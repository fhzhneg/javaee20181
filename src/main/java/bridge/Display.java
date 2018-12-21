package bridge;

/**
 * 用委托的方式实现输出，输出不是自己完成的，是交给impl类去完成的
 * 实面的是两个类的弱关联
 * @author fhzheng
 *
 */
public class Display {

	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	/**
	 * 做显示处理
	 */
	public final void display() {
		open();
		print();
		close();
	}
}
