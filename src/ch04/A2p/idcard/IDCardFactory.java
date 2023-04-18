package ch04.A2p.idcard;

import java.util.Hashtable;

import ch04.A2p.framework.Factory;
import ch04.A2p.framework.Product;

public class IDCardFactory extends Factory {

    private Hashtable<String, Integer> manager = new Hashtable<>();
    private int serial = 100;

    @Override
    protected Product createProduct(String owner) {
        manager.put(owner, serial);
        return new IDCard(owner, serial++);

    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "등록했습니다.");
    }

}
