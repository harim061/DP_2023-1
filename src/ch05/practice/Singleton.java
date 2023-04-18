package ch05.practice;

//싱글톤 패턱을 적용
public class Singleton {

    // 3.singleton 객체 미리 생성
    // static은 클래스에 속함. 객체 생성 전에 내용을 담고 있음
    private static Singleton singleton = new Singleton();

    // 1. 생성자를 private으로 한다
    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
    }

    // 2. 객체를 얻어가는 메소드를 구현
    public static Singleton getInstance() {
        return singleton;
    }

}
