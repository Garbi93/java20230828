package ch17stream.lecture;

import java.util.List;

public class C05terminal {
    public static void main(String[] args) {
        List<String> list = List.of("css", "html","spring");
        long count = list.stream()
                .count();   // 최종연산 -> count 는 stream의 element가 몇인지 알려준다 (long타입 반환)
        System.out.println("count = " + count);
        System.out.println("list.size() = " + list.size());
    }
}
