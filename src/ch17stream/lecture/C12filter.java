package ch17stream.lecture;

import java.util.List;

public class C12filter {
    // 중간 연산
    public static void main(String[] args) {
        var list = List.of(3,1,4,9,10,33,2);

        list.stream()
                .filter(e-> e%2 == 0)   //true면 출력 false면 미출력
                .forEach(System.out::println);
        System.out.println();

        System.out.println("짝수중 가장 작은 값 출력");
        list.stream()
                .filter(e-> e%2== 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("홀수중 가장 작은 값 출력");
        list.stream()
                .filter(e-> e%2==1)
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println();

    }
}
