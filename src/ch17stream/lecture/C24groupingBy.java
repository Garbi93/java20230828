package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C24groupingBy {
    // 그룹화
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "css",
                "html",
                "react",
                "vue",
                "jquery",
                "jsp"
        );
        // 한개의 키 값에 여러개의 값이 들어오는것
        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));

        collect.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
