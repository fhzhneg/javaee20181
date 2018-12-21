package bridge;

public class IncreaseDisplay extends CountDisplay {

	/**
	 * 增长步长
	 */
	private int step;
	
	/**
	 * 显示增长的字符
	 * @param impl 显示实现
	 * @param step 增长增量
	 */
	public IncreaseDisplay(DisplayImpl impl,int step) {
		super(impl);
		this.step = step;
	}
	
	/**
	 * 按步长递增显示
	 * @param level 行级数
	 */
	public void increaseDisplay(int level) {
		int count = 0;
		for (int i = 0; i < level; i++) {
			multiDisplay(count);
			count += step;
		}
	}
}
