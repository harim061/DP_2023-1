package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryNohHaRim2 extends Factory {

    private static IDCardFactoryNohHaRim2 idcard = null;

    private IDCardFactoryNohHaRim2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryNohHaRim2 getInstance() {
        if (idcard == null) {
            idcard = new IDCardFactoryNohHaRim2();
        }
        return idcard;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
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
