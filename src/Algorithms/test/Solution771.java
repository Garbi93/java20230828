package Algorithms.test;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        int count = 0;
        for(char c : jewels.toCharArray()){
            jewelSet.add(c);
        }
        //System.out.println(jewelSet);
        for(char c : stones.toCharArray()) {
            if(jewelSet.contains(c)){
                count++;
            }
        }
        return count;
    }
}
