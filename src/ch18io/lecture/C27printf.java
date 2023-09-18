package ch18io.lecture;

public class C27printf {
    public static void main(String[] args) {
        // width : 출력할 대상이 차지할 영역
        System.out.printf("@%1$s@%n","java");
        System.out.printf("@%1$6s@%n","java");
        System.out.printf("@%1$2s@%n","java");  // 작으면 무시하고 다 출력

        // flag : 출력방법
        System.out.printf("@%1$6s@%n","java");
        System.out.printf("@%1$-6s@%n","java"); // 왼쪽 정렬

        // precision
        // 실수(f)와 같이쓰면 소숫점 이하 출력 갯수
        System.out.printf("%1$f%n",3.141592);   // 그대로 출력
        System.out.printf("%1$.3f%n",3.141592);   // 소숫점 이후 3자리출력
        System.out.printf("%1$.0f%n",Math.PI);   // 소숫점 이후 0자리출력
    }
}
