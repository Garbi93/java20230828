package Algorithms.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        //[3,2,3,2,2,2]

        //[3,2] -> true
        //[2,4] -> true

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        boolean result = true;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value%2 != 0 ) {
                result = false;
                break;
            }else {
                result = true;
            }
        }
        return result;

//        Stream<Map.Entry<Integer, Long>> entryStream = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 2);
//        System.out.println(entryStream.map(e->e.getValue()));

//        return false;
    }
}
