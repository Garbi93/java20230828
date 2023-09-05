package ch12api.lecture;

public class C11String {
    public static void main(String[] args) {
        // String : 문자열
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b);
        System.out.println(a == c);     // new 연산자를 사용한것은 참조 값 이 달라진다.

        System.out.println(a.equals(b));    // true
        System.out.println(a.equals(c));    // true

    }
}
