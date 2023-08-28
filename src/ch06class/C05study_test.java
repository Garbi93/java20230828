package ch06class;

public class C05study_test {
    public static void main(String[] args) {
        Classp1 a1 = new Classp1();
        System.out.println("a1.a[0] = " + a1.a[0]);

        a1 = met();
        System.out.println("a1.a[0] = " + a1.a[0]);     //강남
    }
    public static Classp1 met() {
        Classp1 a2 = new Classp1();
        a2.a[0] = "강남";

        return a2;
    }
}

class Classp1 {
    String[] a = {"철수","영희","민수"};
}