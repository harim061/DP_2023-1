package hw.ch05;

import hw.ch05.idcard.IDCardFactoryNohHaRim1;

public class Main1 {

    public static void main(String args[]) {
        System.out.println("20210985 노하림");

        IDCardFactoryNohHaRim1 factory1 = IDCardFactoryNohHaRim1.getInstance();

        IDCardFactoryNohHaRim1 factory2 = IDCardFactoryNohHaRim1.getInstance();

        if (factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스 입니다.");
        }
    }

}
