package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C29annotation {
    @MyAnnotation29
    int field;
    @MyAnnotation29
    public static void main( String[] args) {
        @MyAnnotation29
        int loacl;
    }
}

// 붙이는곳을 제한
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE})    //여러곳으로 설정도 가능
@interface MyAnnotation29 {

}
