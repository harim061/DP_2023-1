package ch01.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    // 책을 가지고 있는 Iterable

    // Book[] books; // 배열 선언
    private List<Book> books;

    public BookShelf(int maxsize) {
        // this.books = new Book[maxsize];
        this.books = new ArrayList<Book>(maxsize);
    }

    public void appendBook(Book book) {
        // this.books[last] = book;
        books.add(book);

    }

    // public Book getBookAt(int index) {
    public Book getBookFrom(int index) {
        // return books[index];
        return books.get(index);
    }

    public int getLength() {
        return books.size();
        // return last;
    }

    // iterator 반환 메소드
    // public BookShelfIterator iterator() {
    @Override
    public Iterator<Book> iterator() {
        // 책을 돌아다니는 Iterator
        return new BookShelfIteratorBackward(this);
    }
}
