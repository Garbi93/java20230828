package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();    //Parent 타입으로 받아오겠다 선언했기 때문에 Parent 타입 안에 있는것만 쓸 수 있다.

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 차일드 타입으로 강제 형변환
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();

    }
}
