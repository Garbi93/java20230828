package ch09nested.book.sec05.exam01;

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2(){}

    class B {
        void method() {
            field1 = 10;

            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            //인스턴스 멤버에 접근 불가능
            //field1 = 10;
            //method1();

            field2 = 10;
            method2();
        }
    }
}
