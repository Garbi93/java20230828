package ch08interface.book.sec7;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi =new Taxi();
        Bus bus =new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride (Vehicle vehicle) {
        if(vehicle instanceof Bus bus) {
            bus.checkFace();
        }
        // 위에서 아래로 개선됨
        if(vehicle instanceof Bus bus) {

        }

        vehicle.run();
    }
}
