package ch05.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TripleHash {
    private static Map<String, TripleHash> map = new HashMap<>();
    // Map<ke의 타입, value의 타입>

    // 클래스 로드 시 실행할 코드
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new TripleHash(s)));

    }

    private String name;

    private TripleHash(String name) {
        System.out.println(name + "is created");
        this.name = name;
    }

    public static TripleHash getInstance(String name) {
        return map.get(name);
    }
}
