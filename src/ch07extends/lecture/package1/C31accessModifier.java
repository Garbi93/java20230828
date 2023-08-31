package ch07extends.lecture.package1;

import ch07extends.lecture.MyClass30;   // 다른 패키지 내에 있으므로 임포트 시킴

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 =new MyClass30();
        //o1.privateMethod();// 안됨 프리베이트 메소드 이므로
        o1.publicMethod();
        //o1.packagePrivateMethod();// 안됨 다른 패키지 이므로

        // o1.protectedMethod(); // 다른패키지 이므로 안됨 -> 단 상속받으면 사용 가능

    }
}
