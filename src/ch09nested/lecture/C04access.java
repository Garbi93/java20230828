package ch09nested.lecture;

public class C04access {
    // static member는 instance memeber에 접근할 수 없다.
    // instance 는 static 에 접근할 수 있다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass {
        void method () {
            //System.out.println(instanceField);  // static멤버에선 instance멤버 접근 불가능
            System.out.println(staticField);
        }
    }


    class InnerClass{
        void method() {
            System.out.println(instanceField);
            System.out.println(staticField);        // instanc멤버에서 static멤버 접근 가능
        }
    }
}


