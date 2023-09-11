package selfStudy.ch08.sec04;

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
    }
}
