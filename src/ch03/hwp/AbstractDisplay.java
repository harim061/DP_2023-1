package ch03.hwp;

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public void display(int times) {

        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    };

}
