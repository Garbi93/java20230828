package ch12api.lecture;

public class C01object {    // 우리가 만든 클래스도 extends Object 를 기본으로 갖고 있다.
    public static void main(String[] args) {
        // object
        // 모든 클래스의 상위 클래스
        // 모든 타입의 상위 타입
        String s = "java";
        Object o1 = s;
        o1.toString();  // 재정의 한 것 이므로 toString() 은 실제 로는 String 의 것이 실행이 된다.

        Integer i = 3;
        Object o2 = i;

        C01object c = new C01object();
        Object o3 = c;

        // 심지어 기본 타입도 갖고 있다. -> 모든 타입이 가능
        int j = 30;
        Object o4 = j;




    }
}
