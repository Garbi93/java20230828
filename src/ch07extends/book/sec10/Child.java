package ch07extends.book.sec10;

public class Child extends Parent{
    public  int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.name = name;
        this.studentNo = studentNo;
        System.out.println("자식클래스");
    }
}
