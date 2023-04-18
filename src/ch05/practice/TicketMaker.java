package ch05.practice;

public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("인스턴스가 생성되었음");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
