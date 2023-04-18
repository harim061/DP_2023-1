package ch01.practice;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

    // 책꽂이에 접근: 자기가 돌아다닐 집합체가 있어야함
    BookShelf bookShelf;
    int index = 0;

    // 생성자 : 집합체 연결
    // iterator BookShelf 연결
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    // 꺼내온 책이 더 있는지 검사하는 메소드
    @Override
    public boolean hasNext() {
        if (index < this.bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    // 다음 책을 반환하는 메소드
    @Override
    public Book next() {
        Book book = this.bookShelf.getBookFrom(index);
        index++;
        return book;
    }
}
