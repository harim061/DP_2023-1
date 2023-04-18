package ch03.hwp;

public class Main {

    static public void main(String args[]) {
        AbstractDisplay student1 = new NohHaRimDisplay("노하림", "20210985", 3);

        System.out.println();
        student1.display(10);
        System.out.println();
        student1.display(5);
    }

}
