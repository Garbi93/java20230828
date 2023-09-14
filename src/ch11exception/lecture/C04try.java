package ch11exception.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i =0;
            int j = 3/i;
            // exception 이 발생한 순간 아내 코드는 실행 하지 안하고 바로 캐치 로 넘어감
            System.out.println("code3");
            System.out.println("code4");

        } catch (ArithmeticException e) {
            System.out.println("exception code1");
            System.out.println("exception code2");
        }

        System.out.println("code5");




    }
}
