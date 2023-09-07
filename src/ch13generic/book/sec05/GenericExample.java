package ch13generic.book.sec05;

public class GenericExample {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        System.out.println();

        // 직장인만 신청가능
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
    }
}
