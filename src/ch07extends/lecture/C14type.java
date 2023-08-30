package ch07extends.lecture;

public class C14type {
    public static void main(String[] args) {
        // 기본타입
        int a = 3;
        double f = 3.0;
        double g = 32;

        // 참조 타입
        String b = "java";
        Object o = "java";
        Child c= new Child();
        Parent d=  new Parent();
//      ---------------------------
//      변수의 타입 / 변수 / = / new / 들어가는 값
    }
}

class Parent{}

class Child extends Parent{}