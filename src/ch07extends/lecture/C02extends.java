package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
    }
}

// 위 코드에 문법 오류가 없도록 MyClas02를 작성
class MyClass02 {
    String name;
    void method3() {
        System.out.println("MyClass02.instance initializer" + "   " + name);
    }
}
class MySubClass021 extends MyClass02 {

}


