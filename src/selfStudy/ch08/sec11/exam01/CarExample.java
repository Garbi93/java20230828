package selfStudy.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.run();
        // 구현 객체를 바꾸면 실행 값이 변경되는 다형성이 생기게 된다.
    }
}
