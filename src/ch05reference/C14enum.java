package ch05reference;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1 = MySeason.FALL;

        // Enum이 Object를 상속 받기 때문에 toString 이나 hashcode같은 것들을 사용 할 수 있다.
        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.hashCode() = " + v1.hashCode());
        System.out.println("v1.equals(null) = " + v1.equals(null));

        System.out.println("v1.name() = " + v1.name());
        System.out.println("v1.ordinal() = " + v1.ordinal());     // ordinal은 순서 인덱스로 센다.

        System.out.println("v1 = " + v1);
    }
}

enum MySeason {
    // 보이지는 않지만
    // 실제로는 extends Enum 가 작성되어 상속 받아온다
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
