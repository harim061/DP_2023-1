package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryNohHaRim1 extends Factory {

    private static IDCardFactoryNohHaRim1 idcard = new IDCardFactoryNohHaRim1();

    private IDCardFactoryNohHaRim1() {
        System.out.println("인스턴스가 생성되었습니다.");
    }

    public static IDCardFactoryNohHaRim1 getInstance() {
        return idcard;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
