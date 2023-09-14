package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    public static void method3 () throws Exception{
        throw new Exception();  // 그냥 Exception 을 사용 하려면 명시를 해줘야 한다.
    }

}
