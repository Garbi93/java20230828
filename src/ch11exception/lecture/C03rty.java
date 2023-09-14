package ch11exception.lecture;

public class C03rty {
    public static void main(String[] args) {
        System.out.println("code1.....");
        System.out.println("code2.....");

        try{
            // try block;
            // exception 이 발생 할 수 있는 코드
            int i = 0;
            int j = 3/i;    // ArithmeticException
        } catch (ArithmeticException e) {
            // catch block :
            // 발생한 exception 객체를 잡은 후 실행하는 코드
            System.out.println("exception 발생시 실행되는 코드1");
            System.out.println("exception 발생시 실행되는 코드2");
        }


        System.out.println("code3.....");
    }
}
