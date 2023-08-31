package ch07extends.book.p04.package2;

import ch07extends.book.p04.package1.MyClass;

public class MySubClass extends MyClass {
    @Override
    public void method1() {

    }

    @Override
    protected void method2() {

    }

    @Override
    public void method3() {// 부모보다 넓은 범위는 가능하나 좁은 범위는 불가능

    }
}
