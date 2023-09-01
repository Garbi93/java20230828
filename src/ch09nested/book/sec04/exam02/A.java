package ch09nested.book.sec04.exam02;

public class A {
    class C{}
    void useB() {
        class B {
            int field1 = 1;

            static int field2 = 2;

            B() {
                System.out.println("B생성자 실행");
            }

            void method1() {
                System.out.println("B.method1 실행");
            }

            static void mehtod2() {
                System.out.println("B.mehtod2 정적 실행");
            }
        }

        B b = new B();

        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.mehtod2();
    }
}
