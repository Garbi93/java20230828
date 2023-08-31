package ch08interface.lecture;

public class C02interface {
    public static void main(String[] args) {
        MyClass021 o1 =new MyClass021();
        MyInterface02 i2 = o1;

        System.out.println(System.identityHashCode(o1));    // o1 과 i2 의 참조 값은 같다
        System.out.println(System.identityHashCode(i2));    //
        System.out.println("---------------------------------");

        MyInterface02 i3 = new MyClass021();
        System.out.println(System.identityHashCode(i3));
        // i3 는 새로 MyClass021()을 참조 사기 때문에 o1,i2 와는 참조값이 다르다.
        i3.method1();
        i3.method2();
        System.out.println("----------------------------");

        MyInterface02 i4 = new MyClass022();
        System.out.println(System.identityHashCode(i4));
        i4.method1();
        i4.method2();
    }
}

interface MyInterface02 {// 인터페이스 생성
    // 추상 메소드 (몸통이 없는)
    abstract public void method1();

    void method2(); // 인터페이스 내에서는 앞에 아무것도 안써도 public 이고 abstract인 추상 메소드
}

class MyClass021 implements MyInterface02 {
    // 추상 메소드가 있는 상위 타입을 받으려면 추상 메소드를 구현 해야한다


    @Override
    public void method1() {
        System.out.println("MyClass021.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass021.method2");
    }
}

class MyClass022 implements MyInterface02{
    @Override
    public void method1() {
        System.out.println("MyClass022.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass022.method2");
    }

}
