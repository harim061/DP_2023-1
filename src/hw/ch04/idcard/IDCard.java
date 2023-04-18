package hw.ch04.idcard;

import ch04.practice.framework.Product;

public class IDCard extends Product {
    private String owner;

    // 패키지 visivility
    // public IDCard(String owner) {
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); // + : 문자열 연결, this.toString()
    }

    @Override
    public String toString() { // Object 클래스로부터 상속
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
