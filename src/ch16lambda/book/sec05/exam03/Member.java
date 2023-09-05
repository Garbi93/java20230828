package ch16lambda.book.sec05.exam03;

public class Member {
    private String id;
    private String name;

    //매개변수가 1개인 생성자
    public Member(String id) {
        this.id = id;
        System.out.println("Member(String id)");
    }

    // 매개변수가 2개인 생성자
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString() {
        String info = "{ id : "+id +", name : "+name+"}";
        return info;
    }
}
