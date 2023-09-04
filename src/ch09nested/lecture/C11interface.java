package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
//        MyInterface11 i1 = new MyInterface11(); -> 인터페이스 역시 추상클래스처럼 바로 생성을 불가능하지만
        MyInterface11 o1 = new MyClass111();
        MyInterface11 i2 = new MyInterface11() {
            // 익명 생성을 하면 바로 사용 가능하다
            // 익명 클래스도 부모에 추상 메소드가 생성되면 메소드를 생성해야 한다.
            @Override
            public void methd1() {
                System.out.println("C11interface.methd1");
            }

        };
        i2.methd1();

    }
}

interface MyInterface11{
    void methd1();
}

class MyClass111 implements MyInterface11{

    @Override
    public void methd1() {
        System.out.println("MyClass111.methd1");
    }
}