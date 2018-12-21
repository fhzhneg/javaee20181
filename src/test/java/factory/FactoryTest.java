package factory;

import static org.junit.Assert.*;

import org.junit.Test;

import factory.TV.TVFactory;
import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class FactoryTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void cardTest() {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("郑乐乐");
		Product card2 = factory.create("郑山山");
		Product card3 = factory.create("郑蓓蓓");
		Product card4 = factory.create("郑培培");
		
		System.out.println("--------------------");
		
		card1.use();
		card2.use();
		card3.use();
		card4.use();
	}
	
	@Test
	public void tvTest() {
		Factory factory = new TVFactory();
		//强转为子类型，设置屏幕大小
		((TVFactory)factory).setSize("48寸屏");
		Product tv1 = factory.create("长虹");
		Product tv2 = factory.create("海尔");
		((TVFactory)factory).setSize("88寸屏");
		Product tv3 = factory.create("格力");
		Product tv4 = factory.create("夏普");
		
		System.out.println("--------------------");
		
		tv1.use();
		tv2.use();
		tv3.use();
		tv4.use();
	}
}
