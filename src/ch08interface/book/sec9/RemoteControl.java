package ch08interface.book.sec9;

public interface RemoteControl {
    int MAX_VOLUM = 10;
    int MIN_VOLUM = 10;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {

    }

    static void changeBattery() {
        System.out.println("리모컨 건전지를 교체합니다.");
    }
}
