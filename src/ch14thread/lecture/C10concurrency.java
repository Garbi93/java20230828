package ch14thread.lecture;

public class C10concurrency {
    // 동시에 작동해서 생기는 문제
    private static int value = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0 ; i<100000; i++) {
                value++;
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
           for(int i=0; i<100000; i++) {
               value++;
           }
        });
        t2.start();
        // 여러쓰레드가 동시에 계산,증감 하면 문제가 발생하니 사용하지 않는것을 권장


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("value = " + value);
    }
}
