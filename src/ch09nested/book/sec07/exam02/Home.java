package ch09nested.book.sec07.exam02;

public class Home {
    // Field
    private RemoteControl rc =new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("티비를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("티비를 끕니다");
        }
    };

    // method
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // method
    public void use2() {
        // 변수 선언
        RemoteControl rc =new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }


}
