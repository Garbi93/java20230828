package selfStudy.ch05.sec05;

public class StringExample {
    public static void main(String[] args) {
        String name1 = "홍길동";   // 그냥 생성 할때는 주소가 같지만
        String name2 = "홍길동";
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));

        String name3 = new String("홍길동");   // new 로 생성하면 주소값이 달라진다
        String name4 = new String("홍길동");
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));

        System.out.println(args.length);
    }
}

