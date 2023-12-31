package Algorithms.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        /*
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)){
                // 이미 있으면
                int oldValue = map.get(num);
                map.put(num, oldValue+1);
            } else {
                map.put(num, 1);    // 첫 발견
            }

        }

        // [1, 1]
        // [2, 2]
        // [3, 1]
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)) {
                sum += entry.getKey();
            }
        }
        System.out.println(map);
        return sum;

         */
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e-> e.getKey())
                .mapToInt(Integer::intValue)
                .sum();

    }
}
