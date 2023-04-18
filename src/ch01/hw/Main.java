package ch01.hw;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("20210985노하림");
        System.out.println();

        Book b1 = new Book("자료구조론", "박우창");
        Book b2 = new Book("소프트웨어분석설계", "최승훈");
        Book b3 = new Book("프로그래머수학", "이주영");
        Book b4 = new Book("컴퓨터동작원리", "유견아");
        Book b5 = new Book("컴퓨터그래픽스", "이경미");
        Book b6 = new Book("구의 증명", "최진영");
        BookShelf bs1 = new BookShelf(10);

        bs1.appendBook(b1);
        bs1.appendBook(b2);
        bs1.appendBook(b3);
        bs1.appendBook(b4);
        bs1.appendBook(b5);
        bs1.appendBook(b6);

        // iterator를 이용해서 책이름 출력하기
        System.out.println("<book list using iterator>");
        Iterator<Book> iterator = bs1.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            System.out.println(b.getName() + "-" + b.getAuthor());
        }

    }
}
