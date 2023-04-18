package ch01.pr;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("book1");
        Book b2 = new Book("book2");
        BookShelf bs = new BookShelf(4);

        bs.appendBook(b1);
        bs.appendBook(b2);

        Iterator<Book> iterator = bs.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            System.out.println(b.getName());
        }
    }
}
