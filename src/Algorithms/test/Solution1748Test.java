package Algorithms.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1748Test {

    @Test
    void sumOfUnique() {
        Solution1748 o = new Solution1748();
        int i = o.sumOfUnique(new int[]{1, 2, 3, 2});
        assertEquals(4, i);
        int j = o.sumOfUnique(new int[]{1,1,1,1,1});
        assertEquals(0, j);
        int k = o.sumOfUnique(new int[]{1,2,3,4,5});
        assertEquals(15, k);
    }
}