package ch05.P;

public class Main {

    public static void main(String args[]) {

        Singleton.getSingleton();

        SingletonEnum.INSTANCE.hello();

        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());

        Triple a = Triple.getInstance("ALPHA");
        Triple b = Triple.getInstance("BETA");
        Triple c = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");

        if (a == a2) {
            System.out.println("same");
        }

    }

}
