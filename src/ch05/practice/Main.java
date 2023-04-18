package ch05.practice;

public class Main {

    public static void main(String args[]) {
        Singleton x = Singleton.getInstance();
        Singleton x2 = Singleton.getInstance();

        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());

        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");

        if (a1 == a2) {
            System.out.println("same");
        }
        TripleHash a21 = TripleHash.getInstance("ALPHA");
        TripleHash b21 = TripleHash.getInstance("BETA");
    }
}
