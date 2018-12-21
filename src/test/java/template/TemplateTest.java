package template;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void mainTest() {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("HelloFhzheng");
		AbstractDisplay d3 = new StringDisplay("你好，成都，四川");
		d1.display();	
		d2.display();	
		d3.display();	
	}

}
