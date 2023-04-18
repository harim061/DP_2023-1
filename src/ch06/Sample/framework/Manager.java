package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

//Product 라는 부모 타입으로 코딩이 되어있음

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
