package ch04.A2p.idcard;

import ch04.A2p.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드 " + serial + "번 " + "생성 되었습니다");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "사용중");
    }

    @Override
    public String toString() {
        return "[IDCard :" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
