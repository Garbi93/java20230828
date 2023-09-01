package ch08interface.book.sec10;

public interface Service {

    default void defaultMethod1 () {
        System.out.println("Service.defaultMethod1 종속코드");
        defaultCommon();
    }

    default void defaultMethod2 () {
        System.out.println("Service.defaultMethod2 종속코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("Service.defaultCommon 중복코드A");
        System.out.println("Service.defaultCommon 중복코드B");
    }

    static void staticMethod1() {
        System.out.println("Service.staticMethod1 종속코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("Service.staticMethod2 종속코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("Service.instance initializer 중복코드C");
        System.out.println("Service.instance initializer 중복코드D");
    }

}
