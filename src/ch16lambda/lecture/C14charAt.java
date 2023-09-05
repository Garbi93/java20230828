package ch16lambda.lecture;

public class C14charAt {
    public static void main(String[] args) {
        // chatAt : 특정 인덱스의 char 리턴
        String a= "spring";
        char c = a.charAt(0);// 's'
        System.out.println(c);

        System.out.println(a.charAt(1));
        System.out.println(a.charAt(a.length()-1));
        //System.out.println(a.charAt(6));// 넘어가기 때문에 프로그램 종료됨

        System.out.println(a.charAt(0)+0);//char 타입이기 때문에 연산자 뒤에 따라 타입이 바뀐다.
        System.out.println(a.charAt(0)+"");
    }
}
