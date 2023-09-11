package ch15collection.book.q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        String maxId = "";

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> s : set){
//            System.out.println(s.getKey() + " : " + s.getValue());
            if(maxScore < s.getValue()) {
                maxScore = s.getValue();
                maxId = s.getKey();
            }
            totalScore +=s.getValue();


        }
        System.out.println();
        System.out.println("평균 점수 : "+totalScore/3);
        System.out.println("최고 점수 : "+maxScore);
        System.out.println("최고 점수 받은 아이디 : "+ maxId);
    }
}
