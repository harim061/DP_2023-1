package ch10.Sample;

public class Main {

    public static void main(String[] args) {
        // Hand h1 = Hand.ROCK;
        // System.out.println(h1.toString());

        // Hand h2 = Hand.getHand(2);
        // System.out.println(h2);

        // // h1이 h2를 이기는지
        // if (h1.isStrongerThan(h2)) {
        // System.out.println("h1이 이김");
        // } else if (h2.isStrongerThan(h1)) {
        // System.out.println("h2이김");
        // } else {
        // System.out.println("무승부");
        // }

        // WinningStrategy ws1 = new WinningStrategy(100);

        // ws1.study(false);

        // Hand wsh1 = ws1.nextHand();
        // System.out.println(wsh1);

        // ws1.study(true);
        // wsh1 = ws1.nextHand();
        // System.out.println(wsh1);

        // 게임진행

        // 1.플레이어 생성

        Player p1 = new Player("노하림", new ProbStrategy(100));
        Player p2 = new Player("채형원", new WinningStrategy(200));

        p2.setStrategy(new ProbStrategy(300));

        // 2.게임 시작
        for (int i = 0; i < 10000; i++) {

            Hand h1 = p1.nextHand();
            Hand h2 = p2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("winner" + p1);
                p1.win();
                p2.lose();
            } else if (h1.isWeakerThan(h2)) {
                System.out.println("winner" + p2);
                p2.win();
                p1.lose();
            } else {
                System.out.println("even");
                p2.even();
                p1.even();
            }
        }

        System.out.println(p1);
        System.out.println(p2);
    }
}
