package ch08interface.lecture;

import ch08interface.book.sec3.B;

public class C06polymorphism {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setWeapon(new Gun());
        h.attack();

        h.setWeapon(new Bow());
        h.attack();

        System.out.println("게임을 종료합니다.");
    }
}

class Hero {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        weapon.trigger();

    }

}

interface  Weapon {
    void trigger();
}

class Gun implements Weapon {
    @Override
    public void trigger() {
        System.out.println("방아쇠를 당기다");
    }
}

class Bow implements Weapon {
    @Override
    public void trigger() {
        System.out.println("활 시위를 당기다.");
    }
}
