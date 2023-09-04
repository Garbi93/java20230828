package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        // lambda
        // (파라미터 목록 ) -> {메소드 몸통};
        MyInterface02 o1 = ()-> {
                System.out.println("C02lanbda.method");
        };

        // 메소드 몸통의 코드가 한 줄이면 줄괄호 까지 생략 가능
        MyInterface02 o2 = () -> System.out.println("메소드 내 코드가 한줄");

        o2.method();
    }
}


@FunctionalInterface
interface MyInterface02 {
    // 파라미터 없는 추상 메소드
    // 리턴도 없음
    void method();
}
