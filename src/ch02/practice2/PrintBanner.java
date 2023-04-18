package ch02.practice2;

// 어댑터(위임을 이용)
public class PrintBanner extends Print {

    private Banner banner; // 220v

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() { // 12v
        banner.showWithParen(); // 220v (위임)
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
