package selfStudy.ch09.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;
        static int field2 = 2;

        B (int field1) {
            this.field1 = field1;
           // System.out.println("B생성자");
        }

        void method1 () {
            System.out.println("B-메소드1");
        }

        // 정적메소드 (17버전부터 가능)
        static void method2 () {
            System.out.println("B-의 정적메소드2 실행");
        }
    }
}
