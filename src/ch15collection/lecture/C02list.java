package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        // List : 순서가 있음, 중복된 원소 저장 가능
        List<String> list = new ArrayList<>();  // 별일 없으면 ArrayList 불러오자

        // element 추가
        list.add("java");
        list.add("spring");
        //list.add(3);    // 위에<String>이므로 불가
        list.add("css");
        list.add("react");
        System.out.println();

        // element 꺼내기
        String s = list.get(0);
        String s1 = list.get(3);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println();

        // 몇개의 원소가 있는지?
        int size = list.size();
        System.out.println("size = " + size);
        list.add("react");
        list.add("css");
        System.out.println(list.size());

        // 지우기
        // 중복된것을 지울땐 먼저 들어가 있는 것부터 지운다.
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());
        System.out.println();
        //지워지고 난후 읽어들이면 순서가 바뀌어 있다.
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println();

        // 있는지 확인
        boolean contains = list.contains("java");
        boolean contains1 = list.contains("react");
        System.out.println(contains);
        System.out.println(contains1);
        System.out.println();

        // 전체 원소 탐색 (for)
        System.out.println("for문 사용 전체탐색");
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("향상된 for문 사용 전체탐색");
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("foreach 메소드로 전체 탐색");
        System.out.println("람다");
        list.forEach(e -> System.out.println(e));   // 람다.
        System.out.println();
        System.out.println("메소드 참조");
        list.forEach(System.out::println);          // 메소드 참조 방식



    }
}
