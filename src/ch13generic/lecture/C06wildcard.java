package ch13generic.lecture;


public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
        //MyClass06<Animal> o2 = o1;  //?
        //o2.set(new Animal());

        MyClass06<? extends Animal> o3 = o1; // -> o3 의 타입은 타입 파라미터가 Animal 또는 그 하위 타입을 할당할 수 있다.
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
        // Animal보다 이하 타입 가능
        Animal ani1 = o3.get(); // 안전
        //o3.set(new Dog());      // 안전하지 않음
        //o6.set(new Cat());
        ani1.animalMethod();      // 안전하게 사용하기 위함

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
        // Animal보다 이상타입 가능

        o4.set(new Dog());  // 상위타입을 불러오니깐 하위타입들을 넣을 수 있다.
        //Object oo = new Dog();
        //Animal oo = new Dog();
        o5.set(new Cat());

        // super 를 썻을때는 get은 안전하지 않고 set 은 안전하다     out 안전
        // extends를 썻을 때는 set은 안전하지 않고 get은 안전하다.   in  안전


    }
}

class Animal {
    public void animalMethod() {}
}

class Dog extends Animal {}

class Cat extends Animal {}

class MyClass06<T> {
    public void set (T param){}
    public T get() {
        return null;
    }


}
