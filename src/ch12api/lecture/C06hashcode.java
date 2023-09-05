package ch12api.lecture;

public class C06hashcode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println( o1 == o2 );     // false
        System.out.println( o1.hashCode() );
        System.out.println( o2.hashCode() );

        System.out.println(o1 == o3 );
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());
        // o1이랑 달라야하는데 왜 이렇지? -> 문자열의 길이가 같고 각 문자위치의 값이 같은면 (문자가 같으면 ) -> 해쉬코드 가 같다

        System.out.println();
        String o4 = o1;
        System.out.println(o4.hashCode());
        //어떤 객체를 특정 값으로 변경시켜주는것을 해쉬 함수라고 하고 변경된 값을 해쉬 값이라고 한다.
    }
}
