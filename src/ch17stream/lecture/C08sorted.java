package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    // 중간연산
    public static void main(String[] args) {
        // sorted -> 순서 정렬
        var list = List.of(3,1,3,4,5,10,11,0);
        // var 는 뒤에서 오는 타입으로 유추가 가능 할때 쓴다.
        list.stream()
                .sorted()   // 중간연산 -> 순서 정렬
                .forEach(System.out::println);
    }
}
