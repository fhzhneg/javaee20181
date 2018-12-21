package singleton;

public class TickerMaker {

	private int ticket = 100000;
	private static TickerMaker singleton = new TickerMaker();
	private TickerMaker() {}
	
	public static TickerMaker getInstance() {
		return singleton;
	}
	
	/**
	 * 做线程同步
	 * @return 计数器
	 */
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
	
	/**
	 * 未做线程同步
	 * @return 计数器
	 */
	public int getNextTicketNumber1() {
		return ticket++;
	}
}
