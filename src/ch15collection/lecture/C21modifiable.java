package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("흥민", 7, "강인", 10,"민재",30);
        
        Map<String, Integer> map2 = new HashMap<>(map);
        map2.put("천수",50);
        System.out.println("map2 = " + map2);
        System.out.println("map2.size() = " + map2.size());
        System.out.println("프로그램 실행중");
    }
}
