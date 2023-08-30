package ch07extends.book.sec14;

public class SportsCar extends Car{
    public void speedUp() {
        speed += 10;
    }

    // 부모 클래스에서 퍼블릭 설정을 해줬기 때문에 사용 불가능
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
