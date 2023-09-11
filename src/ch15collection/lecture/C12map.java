package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        // Map : key, value 쌍 (entry)를 저장
        // key가 중복된 entry가 있을 수 없다.

        Map<String, String> map = new HashMap<>();

        // entry 추가 메소드 -> put
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        // entry 의 갯수 확인 -> size
        int si = map.size();
        System.out.println("si = " + si);

        // entry 를 교체 메소드 -> put
        map.put("student3", "박지성");

        // entry 를 삭제 메소드 -> remove
        map.remove("studnet3"); // -> 키 값만 알아도 삭제 가능하다.


        // entry 의 value를 얻는 메소드 -> get
        String s = map.get("student1");
        System.out.println("s = " + s);
        System.out.println("s = " + map.get("student3"));
        System.out.println("s = " + map.get("student6"));// 없는 값은 null을 내보냄


    }
}
