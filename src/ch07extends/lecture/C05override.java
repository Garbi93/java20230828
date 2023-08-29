package ch07extends.lecture;

public class C05override {
    // 오버라이드
    public static void main(String[] args) {
        MyClass05 i1 = new MyClass05();
        i1.method1();

        MySubClass051 i2 = new MySubClass051();
        i2.method1();   // 새로 만든메소드
        i2.method2();   // 새로 만든메소드
    }

}

class MyClass05 {
    public void method1 () {
        System.out.println("어떤 기능");
    }
}


class MySubClass051 extends MyClass05 {
    public void method2 () {
        System.out.println("추가된 기능");
    }
    
    // 상속 받은곳에서 부모클래스의 기능이 마음에 들지 않으면 다시 정의 할 수 있다.
    // 메소드 재정의(method override)
    public void method1 () {
        System.out.println("변경된 기능");
    }
}
