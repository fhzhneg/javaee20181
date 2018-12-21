package abstract_listfactory;

import java.util.Iterator;

import abstract_factory.Item;
import abstract_factory.Page;

public class ListPage extends Page{

	public ListPage(String title,String author) {
		super(title, author);
	}
	
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>\n<head>\n<title>" + title + "</title>\n");
		buffer.append("<meta charset=\"utf-8\"/>\n</head>\n\n");
		buffer.append("<body>\n");
		buffer.append("<h1>"+ title+ "</h1>\n");
		buffer.append("<ul>\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body>\n</html>\n");
		
		return buffer.toString();
	}
}
