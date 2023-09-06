package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        // wrapper class : 기본타입을 감싸고 있는 클래스

        // 기본타입 : byte, short, long, float, double, char, boolean
        // wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean

        // boxing : 기본타입 -> 참조타입
        // unboxing : 참조타입 -> 기본타입

        // boxing
        int i = 500;
        Integer j = new Integer(i); // boxing
        Integer k = Integer.valueOf(i); // boxing

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("-------------");

        // unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue();

        System.out.println(l);  // unboxing
        System.out.println(m);  // unboxing
        // 예전에는 썻는데 지금은 잘 안씀
        // 이유는 자동으로 해주기 때문에
        System.out.println("---------------");

        // auto boxing
        int n = 777;
        Integer o = n;  //  auto boxing 을 해줌
        System.out.println(o);
        System.out.println("---------------");

        // auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p; // auto unboxing
        System.out.println(q);
        System.out.println("---------------");




    }
}
