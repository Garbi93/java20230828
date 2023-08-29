package ch07extends.book.sec04.exam02;

public class SupersomicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode =SupersonicAirplane.NOMAL;
        sa.fly();
        sa.land();

    }
}
