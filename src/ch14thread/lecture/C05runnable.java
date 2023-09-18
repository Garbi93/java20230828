package ch14thread.lecture;

import java.awt.*;

public class C05runnable {
    public static void main(String[] args) {
//        Runnable r1 = new MyRunnable();
//        // thread 생성시 Runnable 타입을 받아서 사용한다.
//        Thread thread1 = new Thread(r1);
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        Runnable r2 = new YourRunnable();
        Thread thread2 = new Thread(r2);
        thread2.start();
    }
}

// Runnable 이라는 추상인터페이스를 갖고와서 사용도 가능
class YourRunnable implements Runnable {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5 ; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        // thread 가 실행하 작업 작성
        for(int i =0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}