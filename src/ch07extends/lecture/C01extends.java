package ch07extends.lecture;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method1();

        MySubClass011 o2 = new MySubClass011();
        o2.age = 44;
        o2.method1();


    }
}

// 같은 기능을 하는 메소드를 또 사용 해야 하나 의 예 (상속)
//class MySubClass011 {
//    int age;
//    void method1 () {
//        System.out.println("MySubClass011.method1");
//    }
//}

// 위처럼 사용 하지 않고
// MyClass01의 맴버(field, method)를 상속함
class MySubClass011 extends MyClass01 {

}

class MyClass01 {
    int age;

    void method1() {
        System.out.println("MyClass01.method1" + age);    //soutm
    }
}
