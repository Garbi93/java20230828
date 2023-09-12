package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3,4,1);
        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = "+max);

        // 초기값 Integer.MIN_VALUE가 있는 상태가 방해 될때는 초기값이 없는 Optional타입의 reduce를 사용하면 된다.
        List<Integer> list2 = List.of();
        Integer max2 = list2.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max2 = "+max2);

        List<Integer> list3 = List.of();
        Optional<Integer> max3 = list3.stream()
                .reduce(Math::max);
        System.out.println("max3 = "+max3);
    }
}
