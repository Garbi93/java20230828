package ch17stream.lecture;

import java.util.List;

public class C13map {
    // 중간 연산
    // 반영한다의 map
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);

        list.stream()
                .map(a-> 10) // 무언가를 받아서 다른것으로 바꾸고 싶을때
                .forEach(System.out::println);
        System.out.println();

        System.out.println("음수로 바꿔서 출력");
        list.stream()
                .map(x -> -x)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("두배한 값으로 출력");
        list .stream()
                .map(x -> x*2)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("제곱값 출력");
        list.stream()
                .map(x -> x*x)
                .forEach(System.out::println);
        System.out.println();



    }

}
