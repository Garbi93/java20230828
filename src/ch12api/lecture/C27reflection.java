package ch12api.lecture;

public class C27reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass27 o1 = new MyClass27();

        // 클래스의 정보를 얻는 방법들
        Class<? extends MyClass27> c1 = o1.getClass();
        Class<MyClass27> c2 = MyClass27.class;
        Class<?> c3 = Class.forName("ch12api.lecture.MyClass27");

        // 클래스의 정보를 어떤방법으로 얻을수 있고 다 같은 객체를 갖고 있다
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}

class MyClass27 {

}
