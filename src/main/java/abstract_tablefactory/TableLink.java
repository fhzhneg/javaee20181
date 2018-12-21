package abstract_tablefactory;

import abstract_factory.Link;

public class TableLink extends Link {

	public TableLink(String caption,String url) {
		super(caption, url);
	}
	public String makeHTML() {
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}
}
