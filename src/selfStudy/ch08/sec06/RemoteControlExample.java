package selfStudy.ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();

        rc.turnOn();
        rc.setVolume(20);
        rc.turnOff();
        System.out.println();

        rc = new audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        System.out.println();

        rc.setMute(true);
        rc.setMute(false);
        System.out.println("현재 볼륨 : "+ rc.getVolume());
    }
}
