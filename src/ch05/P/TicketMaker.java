package ch05.P;

public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker t = new TicketMaker();

    private TicketMaker() {
        System.out.println("ticket생성");
    }

    public static TicketMaker getInstance() {
        return t;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
