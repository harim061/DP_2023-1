package hw.ch05;

import hw.ch05.idcard.IDCardFactoryNohHaRim2;

public class Main2 extends Thread {

    public static void main(String args[]) {
        System.out.println("20210985 노하림");

        new Main2("최승훈").start();
        new Main2("노하림").start();
        new Main2("채형원").start();

    }

    @Override
    public void run() {
        IDCardFactoryNohHaRim2 idcard = IDCardFactoryNohHaRim2.getInstance();

        System.out.println(getName() + ": idcard = " + idcard);
    }

    public Main2(String string) {
        super(string);
    }
}
