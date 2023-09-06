package ch12api.lecture;

import java.util.Arrays;

public class C25arrays {
    public static void main(String[] args) {
        int[] arr1 = {3,1,5,9,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Student[] arr2 = {
            new Student("이강인"),
            new Student("손흥민"),
            new Student("김민재")
        };

        Arrays.sort(arr2, (x,y)->x.getName().compareTo(y.getName()));  
        // arr2 의 값들이 비교할 수 있는 값이 아니기 때문에 오류 getter메소드를 사용 하여 비교 해야함
        System.out.println(Arrays.toString(arr2));
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
