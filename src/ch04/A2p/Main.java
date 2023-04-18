package ch04.A2p;

import ch04.A2p.framework.*;
import ch04.A2p.idcard.*;

public class Main {

    public static void main(String args[]) {

        Factory f = new IDCardFactory();
        Product p1 = f.create("하림");
        Product p2 = f.create("하림2");
        Product p3 = f.create("하림3");

        p1.use();
        p2.use();
        p3.use();

    }
}
