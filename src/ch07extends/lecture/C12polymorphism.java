package ch07extends.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute12 dog =new Malamute12();
        dog.breath();
        dog.sniff();

        Animal12 ani = dog;
        ani.breath();
        //ani.sniff();    // X 동물에 sniff 기능이 없기 때문에 사용 불가능하다.

        //  Animal12 ani = dog; 와 같은 방식임
        Animal12 ani2 = new Malamute12();
        ani2.breath();
        //ani2.sniff(); // X
    }
}

class Animal12 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}
class Malamute12 extends Animal12{
    public void sniff () {
        System.out.println("냄새를 맡다");
    }
}
