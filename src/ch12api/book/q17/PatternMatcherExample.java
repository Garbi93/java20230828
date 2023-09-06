package ch12api.book.q17;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,12}";
        boolean isMatch = id.matches(regExp);
        if(isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        }else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
