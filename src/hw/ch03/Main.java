package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210985 노하림");

        AbstractDisplay x;
        x = new NohHaRimDisplay("노하림", "20210985", 3);

        x.display(10);
        x.display(5);

    }
}
