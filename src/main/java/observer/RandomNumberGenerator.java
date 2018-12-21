package observer;

import java.util.Random;

/**
 * 具体对象，产生数字
 * 产生随机数
 * @author fhzheng
 *
 */
public class RandomNumberGenerator extends NumberGenerator {

	private Random random = new Random();
	private int number;
	
	@Override
	public int getNumber() {
		return number;
	}

	/* (non-Javadoc)
	 * 用随机方式产生5个1-80的随机数
	 * @see observer.NumberGenerator#execute()
	 */
	@Override
	public void execute() {

		for (int i = 0; i < 5 ; i++) {
			number = random.nextInt(80)+1;
			notifyObserver();
		}
	}

}
