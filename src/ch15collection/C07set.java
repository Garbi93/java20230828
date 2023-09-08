package ch15collection;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        // Set : 객체 (item, element, 원소, 요소)를 담고 있는 객체
        // 특징 : 중복된 element를 저장하지 않는다.

        Set<String> set1 = new HashSet<>();

        // 원소 추가
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        // size : 원소의 갯수
        System.out.println(set1.size()); // 중복 저장을 허용하지 않으므로 3

        // contains: 있는 지 확인
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));
        System.out.println();

        // remove : 삭제
        boolean remove1 = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println("remove1 = " + remove1);
        System.out.println("remove2 = " + remove2);
        System.out.println();
        System.out.println(set1.size());
        System.out.println();

        // of : 새로운 수정불가 set객체 만듬
        Set<String> set2 = Set.of("css", "react", "html");
        //set2.add("java");   // set 객체로 만든덧에 값을 추가하면 exeption 오류를 발생시킴

        // 전체탐색
        // set은 인덱스가 없다.
        // 1번 향상된 for문
        System.out.println("향상된 for문 사용해서 전체탐색");
        for(String str:set2){
            System.out.println(str);
        }
        System.out.println();

        // 2번 forEach
        System.out.println("forEach로 전체탐색");
        set2.forEach(item -> System.out.println(item)); // 람다식
        System.out.println();
        set2.forEach(System.out::println);  // 메소드참조
        System.out.println();


    }
}
