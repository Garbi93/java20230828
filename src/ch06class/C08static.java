package ch06class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
        o1.name = "java";
        o1.printName();
        // 위와 같은 방법은 static멤버에선 권장 되는 것이 아니다

        MyClass08.name = "spring";
        MyClass08.printName();
        // static member 는 클래스 이렇게 이름으로 바로 접근 하는것을 권장
    }
}

class MyClass08{
    static String name;
    
    static void printName () {
        System.out.println("name = " + name);
    }
}

