package ch07extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 =new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();
    }
}

// 추상 메소드를 갖고있는 클래스라면 무조건 추상 클래스가 되어야 한다.
abstract class Animal26{


    // 추상 메소드 : 몸통이 없는 메소드
    abstract public void breath ();
}

class Dog26 extends Animal26 {
    // 추상메소드를 꼭 재정의(ocerride) 해야 자식클래스가 추상클래스가 되는 일을 막을 수 있다.

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}
