package ch01.hw;

public class Book {

    private String name = "";
    private String author = "";

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // 속성

    public Book() {

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // 메소드
}
