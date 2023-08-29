package ch07extends.book.sec07.exam01;

class A {}
class B extends A {}
class C extends A {}
class D extends  B {}
class E extends C {}
public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;   // 최상위 <- 상위
        A a2 = c;   // 최상위 <- 상위
        A a3 = d;   // 최상위 <- 하위
        A a4 = e;   // 최상위 <- 하위

        B b1 = d;   // 상위 <- 하위
        C c1 = e;   // 상위 <- 하위

        //B b3 = e; // 다른 상위 <- 다른하위 불가능
        //C c2 = d; // 다른 상위 <- 다른하위 불가능
    }
}
