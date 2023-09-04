package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface {

            @Override
            public void mehtod2() {
                System.out.println("ConcreteClass.mehtod2");
            }
        }

        ConcreteClass c = new ConcreteClass();
        c.mehtod2();
    }
}

class MyClass081 implements MyClass08.NestedInterface {

    @Override
    public void mehtod2() {
        System.out.println("MyClass081.mehtod2");
    }
}

class MyClass08 {
    interface  NestedInterface {
        // public final static field
        // public abstract instance method (**************)
        void mehtod2 ();
        // private instance method
        // default instance method
        // private static method
        // public static method
    }

    void method1 () {
        class ConcreteClass implements NestedInterface {

            @Override
            public void mehtod2() {
                System.out.println("ConcreteClass.mehtod2");
            }
        }

        ConcreteClass c = new ConcreteClass();
        c.mehtod2();
    }
}
