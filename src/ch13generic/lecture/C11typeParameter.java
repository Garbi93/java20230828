package ch13generic.lecture;

public class C11typeParameter {
    public static void main(String[] args) {
        MyClass11<Animal> o1 = new MyClass11<Animal>();
        MyClass11<Cat> o2 = new MyClass11<Cat>();
        MyClass11<Dog> o3 = new MyClass11<Dog>();
    }
}

class MyClass11 <T extends Animal> {
    // Animall 이 갖고 있는 메소드를 안전하게 사용학고 싶어서 T 파라메터의 인스턴스를 제한 함
    public void method (T param) {
        param.equals(null);
        param.toString();
        param.hashCode();
        param.animalMethod();

    }
}
