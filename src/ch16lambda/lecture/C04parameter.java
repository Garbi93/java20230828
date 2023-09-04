package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        MyInterface04 o1 = (int x) -> {}; // 원래는 이렇게 작성 했었지만
        MyInterface04 o2 = x -> {}; // 파라미터가 한개라면 소괄호 ( ) 도 생락가능 하다.

        // 람다식 예 (list forEach)
        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e-> System.out.println(e));

        int[] arr = {10, 20,40,100,200,300};
        Arrays.stream(arr).forEach(e-> System.out.println(e));
        System.out.println();

    }
}

@FunctionalInterface
interface MyInterface04 {
    void method(int x);
}
