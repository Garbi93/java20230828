package ch16lambda.book.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        // Person 클래스 의 함수가 인스턴스 라서 객체 를 사용 해주어야 한다 (static이 없는 상황)
        Person person =new Person();

        person.action(()->{
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        person.action(()-> System.out.println("퇴근합니다."));
        // 실행문이 1개 일대는 중괄호는 삭제 가능하다
        
        
//        Person.action(()-> {
//            System.out.println("출근합니다");
//            System.out.println("프로그래밍합니다.");
//        });
    }
}
