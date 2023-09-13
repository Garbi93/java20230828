package ch17stream.book.q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                        .collect(Collectors.groupingBy(x -> x.getJob()));

        System.out.println("[개발자]");
        groupingMap.get("개발자").forEach(System.out::println);

        System.out.println("[디자이너]");
        groupingMap.get("디자이너").forEach(System.out::println);



        System.out.println("[개발자]");
        List<Member> result1 = list.stream()
                .filter(x -> x.getJob().equals("개발자"))
                .toList();

        System.out.println(result1);
    }
}

class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return  "name : " + name +
                ", job : " + job  ;
    }
}
