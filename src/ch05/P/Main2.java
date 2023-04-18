package ch05.P;

public class Main2 extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");
        new Main2("A").start();
        new Main2("B").start();
        new Main2("C").start();
        System.out.println("End.");

    }

    @Override
    public void run() {
        S obj = S.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main2(String name) {
        super(name);
    }
}
