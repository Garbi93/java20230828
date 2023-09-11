package selfStudy.ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
    int getVolume();

    // 티폴트 메소드 선언
    default void setMute (boolean mute) {
        if(mute){
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);  // 추상메소드를 사용하려면 구현객체가 필요하다.
        }else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드 선언
    static void changeBettery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
