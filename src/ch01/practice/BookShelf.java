package ch01.practice;

public class BookShelf {

    private Book[] books; //배열 선언

    //책의 마지막 위치
    private int last = 0;


    public BookShelf(int maxsize) {
        //배열 생성
        this.books = new Book[maxsize];
    }

    //책을 꽂는 메소드
    public void appendBook(Book book){
        this.books[last] = book;
        last += 1;
    }

    //책을 꺼내오는 메소드
    public Book getBookAt(int index){
        return books[index];
    }

    //책 갯수를 리턴하는 메소드
    

}
