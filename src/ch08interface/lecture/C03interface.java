package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method1();
        o1.method2();
        MyInterface031 i1 = o1;
        MyInterface032 i2 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1();
        //i1.method2();// interface031 타입이기때문에 o1 타입으로 받아도 다른 인터페이스로 부터 받는 건 사용 불가능

        //i2.method1();// interface032 타입이기때문에 o1 타입으로 받아도 다른 인터페이스로 부터 받는 건 사용 불가능
        i2.method2();
    }
}


interface MyInterface031 {
    void method1();
}
interface  MyInterface032 {
    void method2();
}

class MyClass03 implements MyInterface031, MyInterface032{
    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }
}