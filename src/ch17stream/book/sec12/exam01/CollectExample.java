package ch17stream.book.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동","남", 92));
        totalList.add(new Student("김수영","여", 87));
        totalList.add(new Student("감자바","남", 95));
        totalList.add(new Student("오해영","여", 93));

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        System.out.println("성별이 남자인 사람만 뽑아오기");
        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));

        System.out.println();

        System.out.println("모든 사람들의 이름과 나이를 키벨류 값으로 불러오기");
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                Student::getScore
                        )
                );
        System.out.println(map);

        List<String> collect = totalList.stream()
                .map(Student::getName)
                .toList();
        System.out.println("collect = " + collect);


        Set<Integer> collect1 = totalList.stream()
                .map(Student::getScore)
                .collect(Collectors.toSet());
        System.out.println("collect1 = " + collect1);
    }
}
