package Algorithms.test;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution1431Test {

    @Test
    void kidsWithCandies() {
        Solution1431 o1 = new Solution1431();
        List<Boolean> list = o1.kidsWithCandies(new int[]{2, 4, 5, 1, 3},3);
        //System.out.println(list);

        assertEquals(List.of(true, true, true, false, true), list);

        List<Boolean> list1 = o1.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        assertEquals(List.of(true, false, false, false, false), list1);

        List<Boolean> list2 = o1.kidsWithCandies(new int[]{12, 1, 12}, 1);
        assertEquals(List.of(true, false, true), list2);
    }
}