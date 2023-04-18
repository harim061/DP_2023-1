package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("book1");
        Book b2 = new Book("book2");
        BookShelf bs1 = new BookShelf(10);

        bs1.appendBook(b1);
        bs1.appendBook(b2);

        System.out.println("<book list using for>");
        for (int i = 0; i < bs1.getLength(); i++) {
            System.out.println(bs1.getBookFrom(i).getName());
        }

        System.out.println("<book list using 확장for>");
        for (Book book : bs1) {
            System.out.println(book.getName());
        }

        // iterator를 이용해서 책이름 출력하기
        System.out.println("<book list using iterator>");
        Iterator<Book> iterator = bs1.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            System.out.println(b.getName());
        }

        // 문자열 리스트 다루기 컬렉션 : List, Set, Map
        // ArrayList

        List<String> sList = new ArrayList<String>();
        sList.add("a");
        sList.add("b");
        sList.add("c");

        // 1. for 루프 이용
        System.out.println("<book list using for>");

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        // 2. 확장 루프 이용
        System.out.println("<book list using 확장for>");
        for (String i : sList) {
            System.out.println(i);
        }

        // 3. iterator 이용
        System.out.println("<book list using iterator>");
        Iterator<String> it = sList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // 4. stream이용하기
        System.out.println("<book list using stream이용하기>");
        sList.stream().forEach(System.out::println);
    }
}
