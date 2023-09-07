package ch13generic.lecture;

public class C07wildcard {
    public void otherMethod() {
        someMethod1(new MyClass07<Dog>());
        someMethod1(new MyClass07<Cat>());
        someMethod1(new MyClass07<Animal>());

        someMethod2(new MyClass07<Animal>());
        someMethod2(new MyClass07<Object>());
    }
    public void someMethod1(MyClass07 < ? extends  Animal> param) {
        Animal item = param.getTiem();  // get 안전
    }

    public void someMethod2(MyClass07<?super Animal> param) {
        param.setTiem(new Animal());    // set 안전
    }
}

class MyClass07<T> {
    private T tiem;

    public T getTiem() {
        return tiem;
    }

    public void setTiem(T tiem) {
        this.tiem = tiem;
    }
}
