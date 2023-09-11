package selfStudy.ch08.sec05;

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
        System.out.println();

        // 정적 메소드 호출
        RemoteControl.changeBettery();
    }
}
