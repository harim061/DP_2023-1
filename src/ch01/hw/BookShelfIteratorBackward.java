package ch01.hw;

import java.util.Iterator;

public class BookShelfIteratorBackward implements Iterator<Book> {

    BookShelf bookShelf;
    int index = 0;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength();
    }

    @Override
    public boolean hasNext() {
        if (index > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        Book book = this.bookShelf.getBookFrom(index - 1);
        index--;
        return book;
    }

}
