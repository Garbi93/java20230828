package ch07extends.book.sec07.exam05;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);

//        driver.vehicle = new Bus();
//        driver.drive();
    }
}
