package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(); // String타입의 리스트 생성
        list1.add(new String("java"));  // new 를 사용 하여 새 객체에 넣어주기
        list1.add(new String("Spring"));
        
        boolean c1 = list1.contains(new String("java"));
        System.out.println("c1 = " + c1);   // true ? 인 이유


        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민"));
        System.out.println("c2 = " + c2);   // false?인 이유 -> [equals hashcode]메소드를 재정의 해야  true를 출력한다.
    }
}

class MyClass03 {
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass03 myClass03 = (MyClass03) o;

        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
