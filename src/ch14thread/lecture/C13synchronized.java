package ch14thread.lecture;

public class C13synchronized {
    // 씽크로나이즈드 블럭 이용방법
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);
        Thread t1 = new Thread(new Task(box));
        t1.start();

        Thread t2 = new Thread(new Task(box));
        t2.start();

        t1.join();
        t2.join();

        System.out.println("box.getValue() = " + box.getValue());


    }
}

class Task implements Runnable {

    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox {
    private int value;

    // monitor lock
    // 쓰레드의 순서를 감지해주는 객체를 생성
    private Object lock = new Object();

    public MyBox(int value) {
        this.value = value;
    }

    public void increment() {
        // 문제가 생기는 부분
        // synchronized 로 감싸준다
        synchronized (lock) {
            value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
