package selfStudy.lambda.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();   // Person 안의  action1 이 instance 타입 이니깐 객체를 생성하고
        person.action1((x,y)->{
            double b = x +y;
            System.out.println("리턴할 값은 double : "+b);
            return b;   // 람다가 double 타입이니깐 double 타입의 값을 리턴한다.
        });


        // 실행 하려면 메인 함수내에서 실행 해야 하니깐
        person.action1((x,y)->innerClassMethod(x,y));   // 아래것을 줄인것
        person.action1((x,y)->{
            return innerClassMethod(x,y);               // return 의 의민 는 함수를 종료시키면서 값을 반환 한다??
        });   //
    }

    // 추가로 클래스 내부에 메소드 생성하여 호출한 action에 람다만 갈아 치우기
    public static double innerClassMethod(double a,double b) {
        double c = a * b;
        System.out.println("다른 함수로 교체 "+c);
        return (c);
    }
}

class Person {  // 람다를 사용 할 데이터를 지닌 클래스를 생성
    public void action1(Calcuable calcuable){   // Calcuable 이라는 인터페이스(람다)를 받아온다.
        double a = calcuable.calc(10,4);
        // 인터페이스의 리턴 타입이 double 이니깐 double 타입의 변수를(데이터) 설정하고
    };

}

@FunctionalInterface
interface Calcuable {   // 추상 메소드가 있는 추상 인터페이스 생성 (이것이 바로 람다??)
    double calc(double a, double b);
    // 반환값이 double 타입인 매개변수가 있는 추상메소드를 작성
    // 지금까지 썻던 void는 리턴타입이 없는 메소드라고 하는것이다.
}
