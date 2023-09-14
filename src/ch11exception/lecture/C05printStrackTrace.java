package ch11exception.lecture;

public class C05printStrackTrace {
    // 강제로 예외 발생한것을 출력 해주는 것
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i =0;
            int j = 3/i;
            System.out.println("code2");

        } catch (ArithmeticException e) {
            // 캐치블럭에는 뭐라도 남겨놔야 나중에 수정이 용이하다
            e.printStackTrace();
        }

        System.out.println("code3");
    }
}
