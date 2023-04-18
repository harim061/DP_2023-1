package ch05.P;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("생성되었습니다");
    };

    public static Singleton getSingleton() {
        return singleton;
    }

}
