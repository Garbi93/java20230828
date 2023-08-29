package ch07extends.book.exercise;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire o1 = new SnowTire();
        Tire tire = o1;

        o1.run();
        tire.run();
    }
}
