package ch17stream.lecture;

import java.util.List;

public class C09limit {
    // 중간연산
    public static void main(String[] args) {
        var list = List.of(3,9,10,11,1,0,-3);
        list.stream()
                .limit(3)    // long타입의 파라미터를 받고 받은 값만큼 자른다.
                .forEach(System.out::println);
        System.out.println();

        System.out.println("가장 작은 값 3개 출력");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        // 순서에 따라 결과가 달라진다.
        System.out.println("앞의 3개를 정렬해서 출력해라");
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
