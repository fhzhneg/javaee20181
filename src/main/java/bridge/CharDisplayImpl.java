package bridge;

public class CharDisplayImpl extends DisplayImpl {

	private char head;
	private char body;
	private char foot;
	
	/**
	 * 显示字符
	 * @param head 开头
	 * @param body 中间部分
	 * @param foot 结尾
	 */
	public CharDisplayImpl(char head,char body,char foot) {
		this.head = head;
		this.body = body;
		this.foot = foot;
	}
	
	public void rawOpen() {
		System.out.print(head);
	}
	
	public void rawPrint() {
		System.out.print(body);
	}
	
	public void rawClose() {
		System.out.println(foot);
	}
}
