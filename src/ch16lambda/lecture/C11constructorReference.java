package ch16lambda.lecture;

public class C11constructorReference {
    public static void main(String[] args) {
    // 생성자의 매개변수 타입과 인터페이스의 추상메서드의 매개변수 타입이 같을때
        MyInterface111 o1 = z -> new MyClass11(z);
        MyInterface111 o2 = MyClass11::new;

        MyInterface112 o3 = (a,b) -> new MyClass11(a, b);
        MyInterface112 o4 = MyClass11::new;

    }
}

class MyClass11 {
    MyClass11 (int a) {}

    MyClass11 (String a, int b) {}
}

@FunctionalInterface
interface MyInterface111 {
    MyClass11 method1 (int x);   // 생성자와 같은 타입의 데이터 가 있다면
}

@FunctionalInterface
interface  MyInterface112 {
    MyClass11 method2(String x, int y);
}
