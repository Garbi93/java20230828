package ch07extends.book.sec13;

public abstract class Mechine {
    public void powerOn() {}
    public void powerOff() {}
    public abstract void work();
}

class Computer extends Mechine {
    @Override
    public void work() {
        System.out.println("자식클래스에서 사용");
    }
}

