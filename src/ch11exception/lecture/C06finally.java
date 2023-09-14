package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0 ;
            int j = 3/i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            System.out.println("code3");
        }finally {
            // 트라이 캐치의 마지막에 하나만
            // exception 발생과 관계없이 실행되는 block
            System.out.println("꼭 실행코드");
        }
        System.out.println("code4");
    }
}
