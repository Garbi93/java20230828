package ch12api.book.sec11.exam02;

import java.lang.reflect.Constructor;

public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            //System.out.print();
        }
    }
}
