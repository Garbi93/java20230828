package ch08interface.book.q6;

public class Dog implements Soundable{
    @Override
    public String sound() {
        System.out.println("인스턴스가 스트링 타입 리턴을 받으니깐 ");
        return "멍멍";
    }
}
