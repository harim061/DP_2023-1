package ch10.practice;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}