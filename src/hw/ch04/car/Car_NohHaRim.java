package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_NohHaRim extends Product {

    private String modelName;

    public Car_NohHaRim(String modelName) {

        this.modelName = modelName;
    }

    @Override
    public String toString() { // Object 클래스로부터 상속
        return "" + modelName + "";
    }

    @Override
    public void use() {
        System.out.println("모델명이 " + modelName + "인 car를 사용합니다.");
    }

    public String getmodelName() {
        return modelName;
    }

}
