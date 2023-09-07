package ch13generic.book.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;  // 객체 타입에도 들어가고
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int velue = box2.content;   // 참조 타입에도 들어간다.
        System.out.println(velue);
    }
}
