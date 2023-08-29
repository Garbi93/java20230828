package ch07extends.lecture;

public class C07super {
    public static void main(String[] args) {
        MySubClass071 o1 = new MySubClass071();
        o1.method1();   // 자식 클래스에 접근해 super로 부모클래스 소환
    }
}

class MyClass07 {
    void method1() {
        System.out.println("부모 클래스 메소드 기능");
    }
}

class MySubClass071 extends MyClass07 {
    @Override
    void method1() {
        if (true) {
            // this. 은 지금 클래스 super. 은 부모 클래스 접근
            super.method1();    // 부모 클래스의 원래 메소드 호출
            //System.out.println("부모 클래스의 메소드 기능");

        } else {
            System.out.println("자식 클래스의 재정의한 메소드");
        }
    }
}