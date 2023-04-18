package ch05.P;

public class S {
    private static S s = null;

    private S() {
        System.out.println("생성");
        slowdown();
    }

    public static synchronized S getInstance() {
        if (s == null) {
            s = new S();
        }
        return s;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
