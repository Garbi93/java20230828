package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = ()-> {
            System.out.println("명령문1");
            System.out.println("명령문2");
            return 0;   // 적어도 1번 리턴 값이 존재해야한다.
        };


        MyInterface05 o2 = () -> 0;   // void 가 아닌 리턴 값이 있는 명령문은 return 키워드 가지 지워줘야 한다.
        // 아래 것을 윗줄 처럼 줄여 쓸 수 있다.
        MyInterface05 o3 = new MyInterface05() {
            @Override
            public int method() {
                return 0;
            }
        };


    }
}

@FunctionalInterface
interface  MyInterface05 {
    int method();
}

class MyClass05 implements  MyInterface05 {

    // 적어도 리턴 값이 1개이상 있어야한다
    @Override
    public int method() {
        if (true) {
            return 0;
        }
        return 1;
    }

}