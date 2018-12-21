package bridge;

public class Main {

	public static void main(String[] args) {
/*		Display d1 = new Display(new StringDisplayImpl("hello,China"));
		Display d2 = new CountDisplay(new StringDisplayImpl("hello,America"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,Mr. Bean"));
		RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("hello,myRandom Taiwan"));
		CountDisplay d5 = new CountDisplay(new FileDisplayImpl("d:\\star.txt"));*/
		
		IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<','*', '>'), 1);
		IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('>','#', '<'), 2);
		d6.increaseDisplay(4);
		d7.increaseDisplay(6);
		
		
/*		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(10);
		System.out.println("===========================================");
		d4.randomDisplay(10);
		System.out.println("===========================================");
		d4.randomDisplay(10);
		System.out.println("===========================================");
		d5.multiDisplay(3);*/
	}
}
