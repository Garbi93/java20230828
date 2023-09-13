package ch17stream.book.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);

        System.out.println("나이들만 출력");
        list.stream()
                .map(x-> x.getAge())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("나이들의 합 구해서 출력");
        Integer result = list.stream()
                .map(x -> x.getAge())
                .reduce(0, (x, y) -> x + y);
        System.out.println("나이 합은 : "+ result);
        System.out.println("나이 평균 은 : "+ result/list.size());
        System.out.println();
        //
        System.out.println("가장 많은 나이 구해서 출력 reduce");
        Integer maxAge = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println("가장 나이 많은 사람의 나이 : "+ maxAge);
        System.out.println();
        //
        System.out.println("가장 작은 나이 구해서 출력 reduce");
        Integer minAge = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MAX_VALUE, (x, y) -> Math.min(x, y));
        System.out.println("가장 나이 적은 사람의 나이 : " + minAge);

        //평균구하기 참조타입 stream -> 기본타입stream으로 변경
        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("avg = " + (int)avg);
    }
}

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
