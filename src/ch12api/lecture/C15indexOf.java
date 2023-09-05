package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 시작하는 위치(index) 리턴
        String a = "spring";

        int i = a.indexOf("ring");  // 해당문자가 시적하는 곳이라서 2
        System.out.println(i);

        System.out.println(a.indexOf("p"));

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));  // 처음 발견한곳 중복이면
        int i1 = b.indexOf("ring", 2);// 2
        System.out.println(i1);
        System.out.println(b.indexOf("ring",3));    // 12


    }
}
