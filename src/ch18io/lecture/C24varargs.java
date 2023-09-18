package ch18io.lecture;

public class C24varargs {
    public static void main(String[] args) {
        // 변경가능한 아규먼트들

        // varargs : (가변인자)...
        // 가변인자 없던 시절에는 다 넣어줘야 해따
        method1(3);
        method1(5,6);
        method1(new  int[]{10,20,30});

        // 가변인자 이후
        // 오버로딩 없이 하나의 메소드만 작성해서 처리가 가능 해졌다.
        method2();
        method2(2);
        method2(3,4);
        method2(6,7,8);
    }

    public static void method3(String s, Double d,int... args) {
        // 사용시 주의할 점
        // 파라미터 목록 마지막에만 작성가능
        // 중간이나 처음에 (int... )을 쓰면 오류
    }
    public static void method2(int... nums) {
        // 가변인자 사용법
        // 배열로 사용
        for(int i = 0; i<nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }
    public static void method1(int a) {

    }

    public static void method1 (int a, int b ) {

    }
    public static void method1 (int[] arr){

    }
}
