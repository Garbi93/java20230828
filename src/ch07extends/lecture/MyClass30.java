package ch07extends.lecture;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.puvlicMethod");

        // private 멤버(필드, 생성자, 메소드) 접근 가능
        privateMethod();    // 이건 메소드
    }

    // packate private -> void 앞에 아무것도 안썻을때
    void packagePrivateMethod() {
        System.out.println("MyClass30.packagePrivateMethod");

        //private 멤버 접근 가능
        privateMethod();
        protectedMethod();
    }

    protected  void protectedMethod() { // 자기 자신, 같은 패키지, 다른패키지 내 상속
        System.out.println("MyClass30.protectedMethod");

        privateMethod();
        packagePrivateMethod();
        publicMethod();
    }
}
