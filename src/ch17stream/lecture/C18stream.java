package ch17stream.lecture;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C18stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,3,9,10,11);
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);
        System.out.println("sum.get() = " + sum.orElse(0));

        OptionalInt sum2 = IntStream.of(3, 1, 3, 9, 10, 11)
                .reduce(Integer::sum);
        System.out.println("sum2.orElse(0) = " + sum2.orElse(0));

        //일반 stream에 없고 IntStream에만 있는것(sum)
        int sum3 = IntStream.of(3, 1, 3, 9, 10, 11)
                .sum();
        System.out.println("sum3 = " + sum3);
    }
}
