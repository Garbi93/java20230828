package ch13generic.book.q2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        String str = container1.get(); // 객체타입에 넣기
        System.out.println(str);

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int value = container2.get();  // 참조 타입에 넣기
        System.out.println(value);
    }
}


