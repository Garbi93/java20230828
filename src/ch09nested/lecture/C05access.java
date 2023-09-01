package ch09nested.lecture;

public class C05access {

    // 우연히 밖클래스와 내부 클래스의 이름이 같을때
    String name = "java";

    class InnerClass {
        String name = "spring";

        //
        void method() {
            System.out.println(name);
            System.out.println(this.name);
            // 밖클래스 name 접근
            System.out.println(C05access.this.name);
        }
    }

    public static void main(String[] args) {
        C05access o2 = new C05access();
        InnerClass o1 = o2.new InnerClass();
        o1.method();
    }
}
