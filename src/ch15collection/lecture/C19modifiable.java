package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("html", "css", "react", "js");

        // 새로운 리스트에 기존 수정 불가 리스트를 넣어서 수정 한다.
        List<String> list2 = new ArrayList<>(list1);
        list2.add("java");
        System.out.println("프로그램 실행중");
    }
}
