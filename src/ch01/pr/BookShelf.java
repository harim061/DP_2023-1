package ch01.pr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

    private List<Book> books;

    public BookShelf(int size) {
        this.books = new ArrayList<Book>(size);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfItertaor(this);
    }

    public Book getBookFrom(int index) {

        return books.get(index);
    }

}
