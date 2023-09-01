package ch09nested.book.sec05.exam02;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();

        a.useB();
        System.out.println("-----------------");
        b.print();


    }
}
