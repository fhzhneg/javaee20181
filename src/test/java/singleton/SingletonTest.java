package singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void tripleTest() {
		System.out.println("Start...");
		for (int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstance(i%3);
			System.out.println(i+" : "+triple);
			
		}
		System.out.println("End...");
	}
	
	@Test
	public void tickerMakerTest() {
		System.out.println("Start...");
		System.out.println("Thread synchronized------------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" : "+ TickerMaker.getInstance().getNextTicketNumber());
		}
		System.out.println("Thread Not synchronized---------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" : "+ TickerMaker.getInstance().getNextTicketNumber1());
		}
		System.out.println("End...");
	}
	
	@Test
	public void mainTest() {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println(">>>obj1与obj2是相同的实例.getInstance其实得到的是同一个实例");
		} else {
			System.out.println(">>>obj1与obj2是不同的实例.getInstance其实得到的是不同一个实例");
		}
		System.out.println("End.");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
}
