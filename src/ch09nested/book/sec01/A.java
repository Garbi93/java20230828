package ch09nested.book.sec01;

public class A {

    // 중첩 클래스 생성
    class B {}

    // 클래스 내부에서 호출 가능
    B field = new B();

    // 생성자 안에서 사용 가능
    A() {
        B b = new B();
    }

    // 메소드 안에서 사용 가능
    void method() {
        B b = new B();
    }
}
