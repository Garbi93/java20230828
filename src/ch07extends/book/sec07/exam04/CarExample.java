package ch07extends.book.sec07.exam04;

public class CarExample {// 실행클래스
    public static void main(String[] args) {


        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
