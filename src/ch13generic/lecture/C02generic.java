package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();

        //MyClass02<int> o5 = new MyClass02<int>();
        // 참조 타입만 가능 하므로 기본타입은 Box해서 쓰면 쓸 수 있다

        MyClass02<Object> o6 = new MyClass02<>();
        // 뒤에 타입 쓰는건 생락도 가능하다 앞에 적은것으로 유추가 가능하기 때문
        MyClass02<String> o7 = new MyClass02<>();

    }
}

// generic type
class MyClass02<T> {   // <T>나중에 타입을 받아올때 정하자 넣을때 정하지 말고
    private T a;

}
