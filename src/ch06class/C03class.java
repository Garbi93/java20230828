package ch06class;

public class C03class {
    public static void main(String[] args) {
        MyClass03 o1 =new MyClass03();
        o1.address = "seoul";

        System.out.println("o1.address = " + o1.address);   //seoul; 출력
        
        o1 = method1();
        System.out.println("o1.address = " + o1.address);   //jeju; 출력
    }
    
    public static MyClass03 method1() {
        MyClass03 p = new MyClass03();
        p.address = "jeju";

        return p;
    }
}

class MyClass03 {
    String address;
}
