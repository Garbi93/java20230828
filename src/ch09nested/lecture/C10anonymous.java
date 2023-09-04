package ch09nested.lecture;

public class C10anonymous {
    public static void main(String[] args) {
        //MyClass10 o1 =new MyClass10(); -> 추상클래스는 인스턴스 생성이 불가능 하지만
        MyClass10 o1 =new MySubClass101();
        // 익명 생성을 하면 추상클래스로 바로 인스턴스 생성이 가능하다.
        MyClass10 o2 = new MyClass10(){

        };

    }
}

// 추상클래스
abstract class MyClass10 {

}

class MySubClass101 extends MyClass10 {

}
