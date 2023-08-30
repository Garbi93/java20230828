package ch07extends.lecture;

public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();
        
        if(ani1 instanceof Dog18 d1) {
            //이렇게 작성하면 d1의 메소드를 실행하는 코드로 이어짐
            d1.bark();
        }else {
            System.out.println("개로 형변환 안됨");
        }

        if(ani1 instanceof Cat18 c2){
            c2.meaw();
        }else {
            System.out.println("고양이로 형변환 안됨");
        }
        
        if(ani2 instanceof Cat18 c1) {
            c1.meaw();
        }else {
            System.out.println("고양이로 형변환 안됨");
        }

        if(ani2 instanceof Dog18 d2) {
            d2.bark();
        }else {
            System.out.println("개로 형변환 안됨");
        }
    }
}

class Animal18{
    
}
class Dog18 extends Animal18 {
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat18 extends Animal18{
    public void meaw () {
        System.out.println("야옹");
    }
}
