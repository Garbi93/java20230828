package ch11exception.lecture;

public class C18throws {
    // try catch 로 하지 않고 throws를 사용 하여 처리할 수 있다
    public static void main(String[] args) throws ClassNotFoundException {
        //exception 발생하는 메소드 사용시
        // try-catch로 처리 또는 throws메소드를 사용 하여 처리 가능
        method1();
    }

    public static void method1 () throws ClassNotFoundException {

    }
}
