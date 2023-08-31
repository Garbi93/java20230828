package ch08interface.book.q5;

public class TV implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("TV의 전원이 켜집니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();

    }
}
