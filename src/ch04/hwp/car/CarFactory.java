package ch04.hwp.car;

import java.util.Iterator;
import java.util.Vector;

import ch04.hwp.framework.Factory;
import ch04.hwp.framework.Product;

public class CarFactory extends Factory {

    Vector<Product> modelNames = new Vector<>();

    @Override
    protected Product createProduct(String modelName) {

        return new Car(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(product);
        System.out.println();
        System.out.println(product + "을 등록했습니다.");
    }

    public void printAllModelNames() {
        Iterator<Product> it = modelNames.iterator();
        while (it.hasNext()) {
            Product product = it.next();
            System.out.println(product);
        }
    }

}
