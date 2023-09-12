package ch17stream.lecture;

import java.util.List;

public class C10skip {
    // 중간 연산
    public static void main(String[] args) {
        // skip
        var list = List.of(10,9,1, 2,5,3);
        list.stream()
                .skip(3)    // 몇개를 스킵할 것인지
                .forEach(System.out::println);

        System.out.println("가장 작은값 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 큰 값 출력");
        list.stream()
                .sorted()
                .skip(list.size() - 1)
                .forEach(System.out::println);
    }
}
