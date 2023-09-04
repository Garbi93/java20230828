package ch09nested.lecture;

public class C09anocymous {
    public static void main(String[] args) {
        MyClass09 o1 =new MySubClass091();
        o1.method1();

        // 익명 클래스(anonymous class)
        // 클래스 상속과 인스턴스 생성을 동시에
        MyClass09 o2 = new MyClass09() {
            // 자식클래스를 적지 않고 바로
            // 자식 클래스 몸통
            // field
            // method

            @Override
            void method1() {
                System.out.println("C09anocymous.method1");
            }
        };
        o2.method1();


    }
}

class MyClass09 {
    void method1 () {
        System.out.println("MyClass09.method1");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("MySubClass091.method1");
    }
}
