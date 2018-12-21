package observer;

/**
 * 具体观察者，图示监显
 * @author fhzheng
 *
 */
public class GraphObserver implements Observer {

	public void update(NumberGenerator generator) {

		System.out.print("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}

}
