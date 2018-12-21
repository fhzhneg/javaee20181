import abstract_factory.*;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}	
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link people = factory.createLink("人民日报",	"http://www.people.com.cn/");
		Link cuit = factory.createLink("成都信息工程大学",	"http://www.cuit.edu.cn/");
		Link baidu = factory.createLink("Baidu",	"http://www.baidu.com/");
		Link tencent = factory.createLink("Tencent",	"http://www.tencent.com/");
		Link alibaba = factory.createLink("Alibaba",	"http://www.alibaba.com/");
		Link cuitsc = factory.createLink("成都信息工程大学计算机学院",	"http://jsjxy.cuit.edu.cn/");

		Tray traynews = factory.createTray("日报");
		traynews.add(people);
		traynews.add(cuit);
		traynews.add(people);
		traynews.add(cuit);
		traynews.add(people);
		traynews.add(cuit);
		
		Tray traycuit = factory.createTray("CUIT");
		traycuit.add(cuit);
		traycuit.add(cuitsc);
		traycuit.add(cuit);
		traycuit.add(cuitsc);
		traycuit.add(cuit);
		traycuit.add(cuitsc);
		
		Tray traycom = factory.createTray("COM互联网公司");
		traycom.add(alibaba);
		traycom.add(tencent);
		traycom.add(baidu);
		traycom.add(alibaba);
		traycom.add(tencent);
		traycom.add(baidu);
		traycom.add(alibaba);
		traycom.add(tencent);
		traycom.add(baidu);
		
		Page page = factory.createPage("LinkPage", "郑丰华");
		page.add(traynews);
		page.add(traycuit);
		page.add(traycom);
		page.output();
				
		
	}
}
