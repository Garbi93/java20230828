package ch08interface.lecture;

public class C15exercise {
    MyInterface15 field;

    public static void main(String[] args) {
        C15exercise o1 = new C15exercise();

        // 확인 문제 3 - 보기1
        o1.field = new MyClass151();
        o1.field = new MyClass152();

        // 확인 문제 3 - 보기2
        method(new MyClass151());
        method(new MyClass152());

        // 확인 문제3 - 보기3
        MyInterface15[] arr = new MyInterface15[3];
        arr[0] = new MyClass151();
        arr[1] = new MyClass151();

    }

    public static void method (MyInterface15 param) {

    }

}

interface MyInterface15{

}

class MyClass151 implements MyInterface15 {}
class MyClass152 implements MyInterface15 {}