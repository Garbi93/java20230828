package ch17stream.book.q5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
                );
        list.stream()
                .filter(n -> !n.startsWith("L"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("contain사용");
        list.stream()
                .filter(e-> e.toLowerCase().contains("java"))
                .forEach(System.out::println);
        System.out.println();
    }
}
