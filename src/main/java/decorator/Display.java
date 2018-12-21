package decorator;

/**
 * 显示多行字符串
 * @author fhzheng
 *
 */
public abstract class Display {
	
	/**
	 * 模向字符数
	 * @return
	 */
	public abstract int getColumns();
	/**
	 * 纵向行数
	 * @return
	 */
	public abstract int getRows();

	/**
	 * 获取第row行的字符串
	 * @param row 行号
	 * @return 该定符串
	 */
	public abstract String getRowText(int row);
	
	/**
	 * 全部显示出来
	 */
	public final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
