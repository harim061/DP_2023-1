package hw.ch01;

public class Book {
    private String name;
    private String author;

    public String getAuthor() {
        return author;
    }

    public Book(String name,String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }
}