package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 차일드 타입으로 강제 형변환
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();

    }
}
