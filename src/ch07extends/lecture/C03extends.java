package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}

class MyClass03 {
    private String name;

    void printName() {
        System.out.println("name = " + name);
    }
}

class MySubClass031 extends MyClass03 {
    void setName(String name) {
        // 상위 클래스의 name 이 private 이여서 부모 클래스로 부터 상속 받아오질 못한다.
        //this.name = name;
    }
}


