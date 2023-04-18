package ch10.Sample;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {// 직전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand; // 직전에 이겼으면 같은 손을 리턴함
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
