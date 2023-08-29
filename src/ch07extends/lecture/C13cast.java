package ch07extends.lecture;

import org.w3c.dom.ls.LSOutput;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();

        //ani1.sniff();   // 원래는 사용 불가능 하지만
        // type casting(형 변환)
        Dog13 d1 = (Dog13) ani1;    // 강제로 사용 하고 싶을때 -- 매우 위험
        d1.sniff(); //ok

        // type casting(형 변환)
        Cat13 c1 = (Cat13) ani2;    // 강제로 사용 하고 싶을때 -- 매우 위험
        c1.hunt();
    }
}

class Animal13 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}

class Dog13 extends Animal13 {
    public void sniff () {
        System.out.println("냄새를 맡다.");
    }
}

class  Cat13 extends Animal13 {
    public void hunt() {
        System.out.println("쥐를 잡다.");
    }
}

