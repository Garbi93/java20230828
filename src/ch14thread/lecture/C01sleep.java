package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        Thread.sleep(1000);     // 업무 흐름을 1000ms 멈췄다 실행
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
