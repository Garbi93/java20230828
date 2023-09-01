package ch09nested.lecture;

public class C06localClass {
    public static void main(String[] args) {

        class LocalClass {

        }
    }

    public void method2() {
        // 로컬 클래스 생성 이유 메소드가 작동 될때만 필요하기 때문
        class LocalClass {
            // 필드, 생성자, 메소드 작성 가능

        }

        LocalClass o1 = new LocalClass();

    }
}
