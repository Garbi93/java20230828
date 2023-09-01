package ch09nested.lecture;

public class C07localClass {

    void method() {
        // 로컬 클래스에서 사용되는
        //감싸고 있는 메소드의 지역변수는
        // 값을 변경 할 수 없다.(final)
        int value = 0;
        //final을 안쓴것을 effectively fianl 이라고 한다 -> fianl 을 안썻지만 하위 에서 final 처럼 사용되는것을
        value = 1;
        class LocalClss {
            void method1 () {
                //System.out.println(value); // 위에서 값을 변경 해서 오류가 발생됨
            }
        }
    }

    void method2 (final int param) {
        // 파라미터가 localclass 에서 사용 되면
        // 파라미터의 값을 변경 할 수 없다.
        class LocalClass{
            void method() {
                System.out.println(param);
            }
        }
    }
}
