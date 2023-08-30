package ch07extends.book.sec11;

public abstract class Phone {   // 추상화
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끕니다..");
    }
}
