package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
        String f1 = o1.getField();  // 형변환을 안하고 <위에서 넣은 타입> 바로 사용 가능

        MyClass04<Integer> o2 =new MyClass04<>();
        o2.setField(2000);
        Integer f2 = o2.getField();
        int f22 = o2.getField();    // 자동 언박싱도 가능하다.

        MyClass04<Long> o3 =new MyClass04<>();
        o3.setField(50000L);
        Long f3 = o3.getField();
        long f33 = o3.getField();

    }
}

class MyClass04<T> {
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
