package ch07extends.lecture;

public class C04extends {
    public static void main(String[] args) {
        MySubClass041 o1 =new MySubClass041();
        o1.method1();
        o1.method2();

        MySubClass042 o2 = new MySubClass042();
        o2.method1();
        o2.method3();
    }
}

class MyClass04 {
    void method1() {
        System.out.println("MyClass04.method1");
    }
}

class MySubClass041 extends MyClass04 {
    // 상속 받는 이유는 부모클래스로부터 추가로 입력하고 싶기 때문에
    private  int age;
    void method2() {
        System.out.println("MySubClass041.method2");
    }
}

class  MySubClass042 extends MyClass04{
    private String name;    // 자식클래스에서 원하면 변수 생성 가능
    void method3 () {
        System.out.println("MySubClass042.method3");
    }
}

