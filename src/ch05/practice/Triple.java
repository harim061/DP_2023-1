package ch05.practice;

public enum Triple {
    ALPHA, BETA, GAMMA;

    private Triple() {
        System.out.println(this);
    }

    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
