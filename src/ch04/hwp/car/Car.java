package ch04.hwp.car;

import ch04.hwp.framework.Product;

public class Car extends Product {

    private String modelName;

    Car(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println(modelName + "인 car를 사용합니다.");
    }

    @Override
    public String toString() {
        return "[" + modelName + "]";
    }

    public String getModelName() {
        return modelName;
    }

}
