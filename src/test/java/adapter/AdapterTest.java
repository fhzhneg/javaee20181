package adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void mainTest() {
		Print print = new PrintBanner("Hello,郑丰华");
		print.printWeak();
		print.printStrong();
	}

}
