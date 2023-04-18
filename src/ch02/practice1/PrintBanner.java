package ch02.practice1;

//어댑터 : 인터페이스 전환만(상속이용)
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
        // super = 부모
        // 생성자 안의 super = 부모 생성자(220v Banner)
    }

    @Override
    public void printWeak() { // 12v
        showWithParen(); // 220v (실제 일은 Banner가 함)
    }
    // 12v 요청 -> 220v가 일을 함 : 어댑터떄문

    @Override
    public void printStrong() {
        showWithAster();
    }
}
