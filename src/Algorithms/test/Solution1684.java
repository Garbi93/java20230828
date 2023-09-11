package Algorithms.test;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowset = new HashSet<>();
        int count =0;
        for (char c : allowed.toCharArray()) {
            allowset.add(c);
        }

        for(String s : words) {
            for(char c : s.toCharArray()){
                if(!allowset.contains(c)){
                    count++;
                    break;
                }
            }
        }
//        for(int i = 0; i < words.length; i++){
//            for(int j =0 ; j< words[i].length(); j++) {
//                if(!allowset.contains(words[i].charAt(j))){
//                    count++;
//                    break;
//                }
//            }
//        }
        return words.length-count;
    }
}
