package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081();
        i1.method1();

        //i1.otherMethod(); // X
        //이걸 실행시키고 싶으면 타입 변경 해야한다

        MyClass081 o1 = (MyClass081) i1;
        o1.otherMethod();
    }
}

interface  MyInterface08{
    void method1();
}

class MyClass081 implements MyInterface08 {
    @Override
    public void method1() {
        System.out.println("재정의한 메소드!!!");
    }

    public void otherMethod() {
        System.out.println("MyClass081.otherMethod");
    }
}
