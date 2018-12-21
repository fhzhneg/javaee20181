package iterator;

import org.junit.Test;

/*import iterator.Book;
import iterator.BookShelf;
import iterator.Iterator;*/

public class IteratorTest {

	@Test
	public void test() {
		BookShelf bookShelf = new BookShelf(5);
		bookShelf.appendBook(new Book("心中的中国人"));
		bookShelf.appendBook(new Book("毛主席语录"));
		bookShelf.appendBook(new Book("大学生就业指导"));
		bookShelf.appendBook(new Book("自学JAVA从入门到放弃"));
		bookShelf.appendBook(new Book("肖劲光传奇"));
		Iterator it = bookShelf.iterator();
		
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
