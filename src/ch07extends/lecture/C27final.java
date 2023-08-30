package ch07extends.lecture;

public class C27final {
    public static void main(String[] args) {
        //final 변수 : 값을 한 번만 할당 할 수 있음

        final int a= 3;
        //a=4;//final 은 값을 재할당 불가능
    }
}

class MyClass27{
    final int age = 3;
    final  String name;
    MyClass27 () {  // final 은 생성자에 한해 할당명령이 가능하다.
        this.name = "java";
    }

    MyClass27(String name) {
        this.name = name;
    }
}
