package ch12api.lecture;

public class C33annotation {

    @MyAnnotation33(number = 3, name = "홍길동")
    public static void main(String[] args) {
        @MyAnnotation33(number = 5, name = "손흥민", address = "jeju")
        int value;
    }
}


@interface MyAnnotation33 {
    // parameter
    // argument
    // attribute
    // element *
    // 공식 문서에는 Element 라고 쓰여있다.

    int number();
    String name();
    String address() default "seoul";   // 값을 안주면 seoul 이라고 디폴트로 설정하기
}
