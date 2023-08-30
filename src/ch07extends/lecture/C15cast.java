package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        System.out.println("프로그램 실행 시작!!!");
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1;    //된다(강제 형변환)
        Cat15 c1 = (Cat15) ani2;    //된다(강제 형변환)

        //Cat15 c2 = (Cat15) ani1;    // 안된다. ,문법 오류는 아님 -> 다만 실행할때 오류를 발생시킨다. 프로그램은 실행을 시킴
        //Dog15 d2 = (Dog15) ani2;    // 안된다. ,문법 오류는 아님 -> 다만 실행할때 오류를 발생시킨다. 프로그램은 실행을 시킴
        //-> 위험한 이유는 인텔리제이에서도 사람도 잡질 못하기 때문이다.

        Animal15 ani3 = new Animal15();
        //Dog15 d3 = (Dog15) ani3;// 안된다. ,문법 오류는 아님 -> 다만 실행할때 오류를 발생시킨다. 프로그램은 실행을 시킴

        System.out.println("프로그램 실행 계속됨...");
    }
}

class Animal15 {}

class Dog15 extends Animal15{}

class Cat15 extends Animal15{}