package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) {
        try {
            method1();
            // 최상위 exception 인 Exception오르 catch도 가능
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws ReflectiveOperationException {
        // throws를 exception 의 상위 exception으로 할 수 있다.
        method2();
    }

    public static void method2() throws ClassNotFoundException {

    }
}
