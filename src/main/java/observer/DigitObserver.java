package observer;

/**
 * 具体观察者，数字监显
 * @author fhzheng
 *
 */
public class DigitObserver implements Observer {

	public void update(NumberGenerator generator) {

		System.out.println("DigitObserver:"+generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}

}
