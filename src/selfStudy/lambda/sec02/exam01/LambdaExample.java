package selfStudy.lambda.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.action(()->{
            System.out.println("나는 개발자입니다");
            System.out.println("나는 출근중입니다.");
        });
        person.action(() -> System.out.println("퇴근합니다."));
    }
}

// 추상 메소드를 갖은 인터페이스 생성
@FunctionalInterface
interface Workable {
    void work(); // 매개변수가 없는 타입의 람다식 생성
}

// 인터페이스를 실행 시키는 클래스 생성
class Person {
    public void action(Workable workable) {
        workable.work();
    }
}


