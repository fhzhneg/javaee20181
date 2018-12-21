package abstract_tablefactory;

import abstract_factory.Factory;
import abstract_factory.Link;
import abstract_factory.Page;
import abstract_factory.Tray;

public class TableFactory extends Factory{

	public Link createLink(String caption,String url) {
		return new TableLink(caption,url);
	}
	
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}
	
	public Page createPage(String title,String author) {
		return new TablePage(title, author);
	}
}
