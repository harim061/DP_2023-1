package ch02.practice1;

public class Main {
    public static void main(String[] args) {

        // 가정 : 클라이언트가 직접 Banner를 사용하지 못한다
        Banner b = new Banner("nhr");
        b.showWithParen();
        b.showWithAster();

        // 클라이언트는 Print 인터페이스를 이용하길 원한다.
        Print x = new PrintBanner("nhr");
        x.printWeak();
        x.printStrong();
    }
}
