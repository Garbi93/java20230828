package selfStudy.lambda.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        //Person.action1((x,y)->{}); // Person의메소드가 static 타입이면 이렇게 바로 사용이 가능
        // 하지만 instance 타입의 메소드니깐 Person 타입의 객체를 생성 해서 불러와야지
        Person person = new Person();
        person.action1((x,y)->{ // 여기서는 매개변수를 전달 하는것이 아닌 Person 으로부터 받아오는 것이니깐
            // 아무변수 명으로 사용 해도 괜찮다 단 순서에 따른 사용 위치는 주의 하자
            System.out.println("이름 : " + x + " / 직업 : " + y);
        });

        person.action2((x)->{
            System.out.println(x + " , 홍길동 입니다");
        });
    }
}


// 인터페이스를 받아서 사용할 클래스 생성
class Person {
    public void action1 (Workable workable) {   // Workable 이라는 람다식을 갖고와 매개변수에 데이터를 할당하여 사용하겠다
        workable.work("홍길동", "도적");        // 매개변수의 데이터를 갖고 있겠다.
    }

    public void action2 (Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}

@FunctionalInterface    // 추상 인터페이스 검증
interface Workable {
    void work(String name, String job); // 매개변수가 2개인 추상메소드 생성
}

@FunctionalInterface    // 추상 인터페이스 검증
interface Speakable {
    void speak(String content); // 매개변수가 1개인 추상메소드 생성
}
