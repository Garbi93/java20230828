package ch07extends.lecture;

public class C22extends {
    public static void main(String[] args) {
        MySubClass221 o1 = new MySubClass221();

    }
}

class MyClass22 {

    MyClass22() {   // 생성자
        // 초기화하는 코드들 작성됨.....
        System.out.println("상위 클래스 초기화코드들.....");
    }
}

class MySubClass221 extends MyClass22 {
    MySubClass221 ()  {
        // 상위 클래스 생성자 호출 (초기화하는 코드 실행)
        super();
        // 항상 가장 위에 꼭 있어야함
        // 작성을 안하면 자동으로 가장위에 삽입되었기 때문에 작성 안해서 사용 함.

        // MySubClass221 인스턴스 필드 초기화 코드들....

        System.out.println("하위 클래스 초기화 코드");

    }
}