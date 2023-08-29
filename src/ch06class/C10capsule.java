package ch06class;

public class C10capsule {
}

class MyClass10 {
    private int age;
    private String name;
    // 인스턴스 필드 생성시 별일 없으면 private 를 붙여준다.
    // 대신 관련된 메소드 (getter, setter) 메소드 를public으로 사용한다


    //------------------------------------------------------
    // get 메소드
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //----------------------------------------------------
    // set메소드
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
