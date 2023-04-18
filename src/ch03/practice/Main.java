package ch03.practice;

public class Main {
    public static void main(String[] args) {

        AbstractDisplay x;
        x = new CharDisplay('a');
        // x.open();
        // x.print();
        // x.close();

        x.display();

        x = new StringDisplay("노하림");

        // x.open();
        // x.print();
        // x.close();

        x.display();
    }
}
