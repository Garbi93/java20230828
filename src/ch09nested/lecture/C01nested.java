package ch09nested.lecture;

public class C01nested {
    // 완전 다른 클래스에 서 사용 방법
    public static void main(String[] args) {
        //MyClass01.NestedClass01 o1 =new MyClass01.
        //-----------------------------------------
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
        //-------------------------------------------------
        //이런식으로 호출해서 사용한다.
    }
}

class MyClass01{
    // 중첩 클래스
    // 해당 클래스 내에서만 사용할 목적으로 만듦
    // 하지만 필요하다면 다른 클래스 에서 사용 하게 할 수도 있음
    class NestedClass01 {
        // 필드

        // 생성자

        // 메소드
    }

    // 해당클래스 내에서 사용 하는 법
    void method1() {
        // 이런식으로 사용 가능
        NestedClass01 o1 =new NestedClass01();
    }
}