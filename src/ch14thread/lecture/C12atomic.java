package ch14thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C12atomic {
    // 여러 쓰레드로 하나의 객체의 값을 변경하고 싶을때 사용 하는 Atomic 타입
    private static AtomicInteger value = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                //
                value.getAndIncrement();
            }
        });
        t1.start();

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 100000; i++) {
                //
                value.getAndIncrement();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value = " + value);

        // 여러쓰레드를 사용해도 안전하게 사용 할 수 있는 것 atomic
    }
}
