package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        // 최종 연산
        // reduce(초깃값, 연산)
        // 여러 흘러가는 원소들을 하나로 만들어 주는것
        // 주로 최소, 최대 평균 값 등을 구할때에 사용된다.
        var list = List.of(5,1,3);

        Integer reduce = list.stream()
                .reduce(0, (r, e) -> 0);
        System.out.println(reduce);

        // [5,1,3]
        System.out.println("모든 값 더하기");
        Integer reduce1 = list.stream()
                .reduce(0, (r, e) -> r + e);
        System.out.println(reduce1);

        System.out.println("최대값 구하기");
        Integer reduce2 = list.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println(reduce2);
        System.out.println();

        System.out.println("최소값 구하기");
        Integer reduce3 = list.stream()
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(reduce3);
        System.out.println();

        System.out.println("String 연결연산");
        var list2 = List.of("ja","va","is","g","ood");
        System.out.println("for문으로 문자열 연결");
        String res1 = "";
        for(String e : list2) {
            res1 += e;
        }
        System.out.println(res1);
        System.out.println();
        System.out.println("stream으로 문자열 연결");
        String reduce4 = list2.stream()
                .reduce("", (r, s) -> r.concat(s));
        System.out.println(reduce4);

    }
}
