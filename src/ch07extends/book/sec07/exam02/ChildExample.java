package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        //자식 객체 생성
        Child child = new Child();
        //차일드로는 3개의 메소드 사용 가능하지만 (부모와 자신)
        
        //부모가 자식 객채 받아오기
        Parent parent = child;
        // 부모 로는 부모가 갖고 있는 타입 2개만 사용 가능
        
        parent.method1();
        parent.method2();
        //parent.method3(); // 불가능
    }
}
