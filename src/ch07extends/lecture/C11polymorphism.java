package ch07extends.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        //String t = o; // x 불가능 오브젝트가 더 큰 존재여서
        String t = new String("java");

        int v1 = s.hashCode();  //스트링 해쉬코드
        int v2 = o.hashCode();  //오브젝트 해쉬코드
        int v3 = t.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
        System.out.println(System.identityHashCode(t));
    }
}
