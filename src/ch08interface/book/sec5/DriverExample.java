package ch08interface.book.sec5;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.driver(bus);
        driver.driver(taxi);
    }
}
