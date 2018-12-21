package observer;

/**
 * 抽象观察者
 * @author fhzheng
 *
 */
public interface Observer {

	/**
	 * 用于接受通知的方法
	 * @param generator
	 */
	public abstract void update(NumberGenerator generator);
}
