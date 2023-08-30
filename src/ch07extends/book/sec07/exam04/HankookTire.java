package ch07extends.book.sec07.exam04;

public class HankookTire extends Tire{
    //자식클래스1
    @Override
    public void roll() {
        System.out.println("한국타이어가 회전합니다.");
    }
}
