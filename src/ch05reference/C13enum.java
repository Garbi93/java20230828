package ch05reference;

public class C13enum {
    public static void main(String[] args) {
        // 사용할때
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE3;

        System.out.println("(v1 == v2) = " + (v1 == v2));
        System.out.println("(v1 == v4) = " + (v1 == v4));
        System.out.println("(v3 == v5) = " + (v3 == v5));   // enum타입은 같은 참조를 불러오기때문에 같다
        System.out.println("v1.equals(v2) = " + v1.equals(v2));
        // 참조타입을 비교할때는 주로 equals 를 사용하지만 enum은 (==)을 사용해도 문제없다

    }
}

// 열거(enum)도 참조타입이다.
enum MyEnum {
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE
}
