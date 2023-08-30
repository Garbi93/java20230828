package ch07extends.lecture;

public class C23constructor {
    public static void main(String[] args) {
        MySubClass231 o1 =new MySubClass231();
    }
}

class MyClass23 {
    //생성자를 작성 안하면 자동으로 생성자가 작성되어 있음
    //MyClass23(){}

}

class MySubClass231 extends MyClass23{
    //생성자를 작성 안하면 자동으로 생성자가 작성되어 있음
    //MySubClass231() {}
}
