package ch16lambda.lecture;

public class C03parameter {
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> {/*몸통 작성됨*/};
        MyInterface03 o2 = (x, y) -> {/*몸통 작성됨*/}; // 파라미터의 타입도 작성 안해도 됨
    }
}

@FunctionalInterface
interface MyInterface03 {
    void method(int x, int y);
}
