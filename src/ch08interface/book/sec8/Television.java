package ch08interface.book.sec8;

public class Television implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume> MAX_VOLUME) {    // RemoteContral.MAX_VOLUME으로 안쓰고 그냥 써도 사용 가능
            this.volume = MAX_VOLUME;
        }else if(volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨 : " + this.volume);
    }
}
