package ch12api.lecture;

public class c35Annotation {
    @MyAnnotation35(name = {"son", "lee"})
    int field1;
    @MyAnnotation35(name = "son")   // 값이 하나면 중괄호는 생략도 가능하다.
    int field2;
    public static void main(String[] args) {

    }
}

@interface MyAnnotation35 {
    String[] name();    // 배열타입의 엘레멘트를 받는다면??
}
