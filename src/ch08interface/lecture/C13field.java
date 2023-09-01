package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
        // public static final 필드는 인터페이스.변수명 으로 바로 사용가능
    }
}

interface MyInterface13 {
    int VALUE = 30;  // public static final 로 기본 생성 된다.
    public static final String NAME = "java";   // 쓰나 안쓰나 기본 값으로 들어간다.
    String HOME_ADDRESS = "Seoul";  // final 인 변수명은 대문자로 표시한다

}
