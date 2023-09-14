package ch11exception.lecture;

public class C12polymophism {
    public static void main(String[] args) {
        try {
            // ClassCastEception
            // NullPointException
            // ArithmethicException

        }
        // 하위를 따로 빼고 싶으면 먼저 빼서 catch 해야 한다. 순서에 주의 하자
        catch (ClassCastException e) {
            // ClassCastEception
            // 예외처리
        }catch (RuntimeException e) {
            // NullPointException
            // ArithmethicException
            // 예외처리
        }

        // ClassCast 도 Runtime 의 하위 라 오류
//        catch (ClassCastException e) {
//            // ClassCastEception
//            // 예외처리
//        }
    }
}
