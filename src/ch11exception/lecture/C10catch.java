package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            // exception 발생 가능 코드

        }catch (ArrayIndexOutOfBoundsException e ) {
            // exception을 처리하는 코드
        }catch ( NumberFormatException e ) {
            // exception을 처리하는 코드
        }

        // 캐치블럭을 하나만 쓸 수 있는 코드
        try {

        } catch (NullPointerException | ClassCastException e ) {
            // exception 처리코드
        }
    }
}
