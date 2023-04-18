package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {

        // 신분증 직접 생성
        // Product id01 = new IDCard("nhr");
        // 생성자가 안보이는 문제 발생. 다른 패키지에 있어서 못씀
        // id01.use();

        // 공장을 통해 생성
        Factory f = new IDCardFactory();

        Product id02 = f.create("nhr");
        id02.use();
    }
}
