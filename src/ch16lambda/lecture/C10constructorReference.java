package ch16lambda.lecture;

// 생성자 참조
public class C10constructorReference {
    public static void main(String[] args) {
        MyInterface10 o1 = ()-> {
            return new MyClass10();
        };

        MyInterface10 o2 = ()-> new MyClass10();

        MyInterface10 o3 = MyClass10::new;
    }
}

class MyClass10 {
    // 생성자
    MyClass10() {}  // 파라미터 없는것
}

@FunctionalInterface
interface MyInterface10 {
    // MyClass10 의 생성자를 리턴 하는 함수
    MyClass10 method();
}