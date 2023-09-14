package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        }catch (NullPointerException e ) {
            // 동일한 예외처리 코드
        }catch (ArithmeticException e ) {
            // 동일한 예외처리 코드
        }


        // NullPointerException, ArithmeticException 의 상위타입인
        // RuntimeException 으로 묶어서 한번에 받아 올 수 있다.
        try {

        } catch (RuntimeException e ) {
            // Throwable 까지만 가능

            // 동일한 예외처리코드
        }
    }
}
