package ch07_02;

public class Boat {
    private int length;

    public void setLength(int len) {
        this.length = len;
    }

    public int getLength() {
        return this.length;
    }

    public void move() {
        System.out.print("drift ");
    }
}
