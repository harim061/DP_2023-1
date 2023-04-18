package ch01.pr;

import java.util.Iterator;

public class BookShelfItertaor implements Iterator<Book> {

    BookShelf bookself;
    int index = 0;

    public BookShelfItertaor(BookShelf bookShelf) {
        this.bookself = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index < this.bookself.getLength()) {
            return true;
        } else
            return false;
    }

    @Override
    public Book next() {
        Book book = this.bookself.getBookFrom(index);
        index++;
        return book;

    }

}
