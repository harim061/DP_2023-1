package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {

    Vector<Product> modelNames = new Vector<>();

    @Override
    protected Product createProduct(String modelName) {

        return new Car_NohHaRim(modelName);
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
