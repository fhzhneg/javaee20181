package framework.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProtoTypeTest {
	
	@Test
	public void mainTest() {
		
		//准备
		Manager manager = new Manager();
		UnderlingPen upen = new UnderlingPen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('$');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//生成
		Product p1 = manager.create("strong message");
		Product p2 = manager.create("warning box");
		Product p3 = manager.create("slash box");

		p1.use("Hello,world.");
		p2.use("Hello,world.");
		p3.use("Hello,world.");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
