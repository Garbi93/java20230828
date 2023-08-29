package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        System.out.println("o1의 참조값" + System.identityHashCode(o1));

        o1.age = 30;            // 인스턴스 필드이기 때문에 o1,o2 모두 공유하지 않음
        o1.model = "java";      // 클래스 필드이기 때문에 o1,o2 모두 공유     // 스테틱 필드는 이렇게 사용하는것을 권장하지 않음
        MyClass05.model = "spring";                                     // 스태틱 필드는 이렇게 사용하는것을 권장
        
        System.out.println("o1.age = " + o1.age);
        System.out.println("o2.age = " + o2.age);
        System.out.println("o1.age = " + o1.model);
        System.out.println("o2.age = " + o2.model);

    }
}

class MyClass05 {
    // 속성 fields
    int age;    // instance field 인스턴스 필드

    static String model;    // class field, static field 클래스 필드, 정적필드 -> 인스턴스 필드와 다르게 클래스의 속성 이기 때문에

    // 기능 method
    
}