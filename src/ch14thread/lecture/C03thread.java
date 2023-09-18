package ch14thread.lecture;

import java.awt.*;

public class C03thread {
    public static void main(String[] args) throws InterruptedException {
        // 2개의 쓰레드를 동시에 실행
        Thread thread = new Thread() {
            @Override
            public void run() {
                for(int i =0; i< 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5;i++) {
            toolkit.beep();
            Thread.sleep(1000);
        }

    }
}
