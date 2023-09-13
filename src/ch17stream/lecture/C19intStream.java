package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    // 기능을 전부 보고 싶으면 독스에가서 찾아보자
    public static void main(String[] args) {
        IntStream.of(9,10,0,3,1,22,77,33);

        // 최대값 구하기
        OptionalInt max = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .max();
        System.out.println("max = " + max.getAsInt());

        // 최소값 구하기
        OptionalInt min = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .min();
        System.out.println("min = " + min);
        // 평균 구하기
        OptionalDouble average = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .average();
        System.out.println("average = " + average.getAsDouble());
    }
}
