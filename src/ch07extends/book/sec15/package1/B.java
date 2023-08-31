package ch07extends.book.sec15.package1;

public class B {
    public void method() {  // 프로텍트는 같은패키지 내에서는 사용가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
