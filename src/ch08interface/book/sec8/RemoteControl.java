package ch08interface.book.sec8;

public interface RemoteControl {
    //필드 값
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드 
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");

            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
        }
    }


}
