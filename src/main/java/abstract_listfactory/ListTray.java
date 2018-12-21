package abstract_listfactory;

import java.util.Iterator;

import abstract_factory.Item;
import abstract_factory.Tray;

public class ListTray extends Tray{

	public ListTray(String caption) {
		super(caption);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append("托盘项：" + caption + "\n");
		buffer.append("<ul>\n");
		Iterator it = tray.iterator();
		while(it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
			
	}
}
