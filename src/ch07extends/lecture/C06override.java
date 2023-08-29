package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10();  // "자식 클래스의 메소드" 라고 출력하게 수정하기
    }
}

class MySubClass061 extends MyClass06{
    @Override   // 컴파일시 재정의한 메소드인지 검증함
    // 부모 메소드랑 다르면 오버라이드가 오류를 출력함
    public void method10 () {
        System.out.println("자식 클래스의 메소드");
    }
}

class MyClass06 {
    public void method10 () {
        System.out.println("부모 클래스의 메소드");
    }
}

