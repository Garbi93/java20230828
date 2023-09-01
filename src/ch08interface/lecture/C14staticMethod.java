package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); // static 메소드는 인스턴스 생성 없이 바로 사용 가능하다.
        //MyInterface14.common(); // common은 private 라서 사용 불가능 하다.
    }
}

interface MyInterface14 {
    // 필드 : public static final

    // 인스턴스 메소드 :
    // 추상 메소드
    //default 메소드
    // private 메소드

    //static 메소드
    //public static 메소드
    //private static 메소드

    static void method() {
        // 앞에 아무것도 없는 상태면 public 메소드다
        commmon();
        System.out.println("MyInterface14.method");
    }

    static void method2 () {
        commmon();
        System.out.println("MyInterface14.method2");
    }

    private static void commmon () {    // private 처리로 내부에서만 사용하게 할 수 있다
        System.out.println("어떤 기능1");

    }
}
