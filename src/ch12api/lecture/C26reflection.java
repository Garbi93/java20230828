package ch12api.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C26reflection {
    public static void main(String[] args) {
        MyClass26 o1 = new MyClass26("son");
        
        // 만들어진 인스턴스를 이용해 설계도를 만들고싶다
        //Class<? extends MyClass26> c = o1.getClass();
        // 위에것을 줄인것
        Class c = o1.getClass();

        System.out.println("c.getName() = " + c.getName()); // 클래스 명의 풀네임을 받아온다
        System.out.println("c.getSimpleName() = " + c.getSimpleName());
        System.out.println("c.getPackageName() = " + c.getPackageName());

        Field[] fields = c.getDeclaredFields();
        System.out.println("fields.length = " + fields.length); // 필드 갯수 정보

        Constructor[] constructors = c.getDeclaredConstructors();
        System.out.println("constructors.length = " + constructors.length); // 생성한 생성자의 갯수

        Method[] methods = c.getMethods();
        System.out.println("methods.length = " + methods.length);


    }
}

class MyClass26 {
    private String name;

    public MyClass26(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}