package ch12api.lecture;

public class C34annotation {

    @MyAnnotation34(value = "123", address = "seoul")
    int field;
}

@interface MyAnnotation34 {
    // elements (attributes)

    // value 는 element사용시 생략가능
    String  value();

    // 두개의 값을이상은 받겠다 하면 value를 생략불가능하다
    String address();
}