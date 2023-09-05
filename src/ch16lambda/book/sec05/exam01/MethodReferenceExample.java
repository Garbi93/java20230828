package ch16lambda.book.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // static 메소드 일 경우
        // 람다식
        // person.action((x,y)->Computer.staticMethod(x,y));
        // 메소드 참조 방식
        person.action(new Calcuable() {
            @Override
            public double calc(double x, double y) {
                return Computer.staticMethod(x, y);
            }
        });


        // 인스턴스 메소드일 경우
        Computer com =new Computer();
        // 람다식 방식
        // person.action((x, y)->com.instanceMethod(x,y));
        // 메소드 참조 방식
        person.action(com ::instanceMethod);
    }
}
