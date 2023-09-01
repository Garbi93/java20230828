package ch08interface.lecture;

public class C12private {
}

interface  MyInterface12 {
    default void method1 () {
        // public instance 메소드
        someFeature();
        System.out.println("어떤 기능2");
    }

    default void method2 () {
        // public instance 메소드
        someFeature();
        System.out.println("어떤 기능3");
    }

    private void someFeature () {// 다른 곳에는 공유 하지 않고 내부 안에서만 사용 하고 싶을때 사용
        // private instance 메소드
        System.out.println("어떤 기능1");
    }
}
