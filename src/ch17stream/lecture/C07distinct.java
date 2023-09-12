package ch17stream.lecture;

import java.util.List;

public class C07distinct {
    // 중간연산
    public static void main(String[] args) {
        // 중복제거 distinct
        List<Integer> list = List.of(3,1,7,2,1,3,6);
        long count = list.stream()
                .distinct() // 중간연산 -> 중복을 제거
                .count();   // 중간연산을 쓰려면 마지막에 최종연산
        System.out.println("count = " + count);
    }
}
