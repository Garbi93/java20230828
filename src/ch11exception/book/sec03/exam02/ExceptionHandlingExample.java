package ch11exception.book.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null};
        for(int i=0; i<= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            }catch (ArrayIndexOutOfBoundsException e ) {
                System.out.println("배열의 인덱스 초과됨 : "+ e.getMessage());
            }catch (Exception e ) {
                System.out.println("실행에 문제있음");
            }
        }
    }
}
