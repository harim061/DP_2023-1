package ch05.P;

import java.util.HashMap;
import java.util.Arrays;

import java.util.Map;

public class SingletonHasMap {

    private static HashMap<String, SingletonHasMap> map = new HashMap<>();

    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new SingletonHasMap(s)));

    }

    private String name;

    private SingletonHasMap(String name) {
        System.out.println(name);
        this.name = name;
    }

    public static SingletonHasMap getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
