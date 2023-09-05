package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        // substring : 부분 문자열 추출
        String a = "spring";
        String b = a.substring(0,2);
        System.out.println(b);

        String b2 = a.substring(2,5);
        System.out.println(b2);

        String b3 = a.substring(2, 6);
        System.out.println(b3);

        String b4 = a.substring(2);
        System.out.println(b4);

        System.out.println(a.substring(0));
    }
}
