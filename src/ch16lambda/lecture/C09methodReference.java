package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 =(x,y)->{};
        // x가 갖고 있는 메소드에 y 가 파라미터로 들어간다면??

        MyClass09 o2 =new MyClass09();

        MyInterface09 o3 =(x,y)-> x.someMethod(y);
        MyInterface09 o4 = MyClass09::someMethod;   // 위코드를  해당 코드로 줄일 수 있다.
    }
}

class MyClass09 {
    void someMethod(int a) {

    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y);
}
