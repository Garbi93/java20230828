package ch09nested.lecture;

public class C02staticNested {
    public static void main(String[] args) {
        MyClass02.NestedClass02 o1 = new MyClass02.NestedClass02();
        // static 중첩 클래스는 [.]을 이용해 바로 호출이 가능하다.


    }
}

class MyClass02 {
    static class NestedClass02 {
        //필드, 생성자, 메소드 사용 가능
    }

    void method1 () {
        NestedClass02 o2 = new NestedClass02();
    }
}
