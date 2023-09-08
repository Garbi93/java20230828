// ㅣ
package Algorithms.test;

import java.util.ArrayList;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        // 배열을 리스트로 만들기
        List<Integer> list = new ArrayList<>();

        for(int stone : stones) {
            list.add(stone);
        }
        while(list.size() > 1) {
            //1. sort
            list.sort((o1,o2) -> o2 - o1);
            //2. remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);
            //3. add
            int diff = stone1 - stone2;
            if(diff > 0){
                list.add(diff);
            }
        }
        if(list.size() ==1) {
            return list.get(0);
        }else {
            return 0;
        }
    }
}
