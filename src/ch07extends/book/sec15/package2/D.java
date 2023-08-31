package ch07extends.book.sec15.package2;

import ch07extends.book.sec15.package1.A;

public class D extends A {
    public D () {
        super();
    }

    public void method1() {
        this.field = "velue";

        this.method();
    }

    public void method2(){
        //A a= new A();
        //a.field = "velue";
        //a.method();
    }
}
