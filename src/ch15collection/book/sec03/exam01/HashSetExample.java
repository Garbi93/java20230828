package ch15collection.book.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬랙션 생성
        Set<String> set = new HashSet<String>();

        // 객체 저장 -> 중복 객체는 하나만 저장함
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        // 저장된 객체 출력
        int size = set.size();
        System.out.println("총 객체 수 :  " + size);

        Iterator<String> iterator = set.iterator();

        // next 는 확인안하고 바로 다음것을 불러오는것
//        String next = iterator.next();
//        System.out.println("next = " + next);
//        String next1 = iterator.next();
//        System.out.println("next1 = " + next1);
//        String next2 = iterator.next();
//        System.out.println("next2 = " + next2);
//        String next3 = iterator.next();
//        System.out.println("next3 = " + next3);
        //iterator.next();

        // hasNext는 갖고 있는지 확인 하고 불러오는것
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }

        // 향상된 for문
        for(String elem : set){
            System.out.println("elem = " + elem);
        }
    }
}
