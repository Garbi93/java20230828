package ch07extends.lecture;

public class C24consturctor {
}

// 생성자가 자동으로 생성되기 때문에 발생하는 문제

class MyClass24 {
    int age;


    MyClass24(int age) {    // 파라미터 (받는객체)가 있는 생성자를 만들면 -> 생성자가 자동으로 삽입되지 않는다.
        this.age = age;
    }
}

class MySubClass241 extends MyClass24{

    MySubClass241(){
    // 명시적으로 상위 클래스의 생성자 호출 코드를 작성
        super(30);    // 파라미터를 받는 부모클래스는 상속받는코드는 꼭 작성 하여야한다.
    }
}