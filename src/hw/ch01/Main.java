package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days","csh"));
        bookShelf.appendBook(new Book("Bible","csh"));
        bookShelf.appendBook(new Book("Cinderella","csh"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs","csh"));

        // 명시적으로 Iterator를 사용하는 방법  
        System.out.println("front");
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 명시적으로 Iterator를 사용하는 방법 
        System.out.println("back");
        Iterator<Book> it2 = bookShelf.iteratorBackward();
        while (it2.hasNext()) {
            Book book = it2.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
