package selfStudy.ch09.sec02.exam01;

public class A {
    // 필드
    int field;
    B field2;
    // 생성자
    A () {
        B b= new B(); // A내부라서  A객체로 따로 생성 안하고 바로 사용 가능
        b.methodB();
    }

    // 메소드
//    static void methodA () {
//        B b= new B(); // 정적선언에서는 객체생성을 할 수 없다.
//        b.methodB();
//    }
    void methodA () {
        B b= new B();
        b.methodB();
    }

    // 네스티드 클래스 (중첩된 클래스)
    public class B {
        // 필드
        // 생성자
        // 메소드
        public void methodB() {
            System.out.println("methodB () 실행 ");
        }
    }
}
