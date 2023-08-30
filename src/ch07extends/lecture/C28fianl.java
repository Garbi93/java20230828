package ch07extends.lecture;

public class C28fianl {

}

class MyClass28 {
    // 파이널 메소드는 (상속 받는곳에서도 )재정의 할 수 없다.
    final void method1() {
        System.out.println("어떤 메소드");
    }
}

class MySubClass281 extends MyClass28{
//    void method1() {
//
//    }
}
