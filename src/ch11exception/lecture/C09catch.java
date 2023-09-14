package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {
        // 예상되는 exception 이 여러개인경우
        try {
            int[] arr = {1,0};
            int i = 3/arr[0];

            System.out.println("try내의 흐름");

            // 트라이 블럭 에서
            // 여러 익셉션이 발생 할 수 있으면
            // 여러 캐치 블럭을 작성 해주면 됨

        } catch (ArithmeticException e) {
            System.out.println("잘못된 산술연산!!!");
        }catch (IndexOutOfBoundsException e ) {
            System.out.println("잘못된 인덱스 참조@@@");
        }

        System.out.println("실행흐름 이어감....");

    }
}
