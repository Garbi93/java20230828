package ch14thread.lecture;

import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        // thread 만들기
        Thread thread = new MyThread();
        // thread 시작
        thread.start();


        // 새로운 쓰레드 만들어 쓰기
        Thread thread1 = new YourThread();
        thread1.start();
    }
}

// 상속받아 새로운 클래스 생성
class YourThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0 ; i< 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


// Thread 를 상속 받아서 클래스를 생성
class MyThread extends Thread {
    @Override
    public void run() {
        // thread가 해야할 일 작성
        for(int i= 0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("띵");

        }
    }
}
