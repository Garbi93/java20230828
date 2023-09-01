package ch09nested.lecture;

import static java.lang.Math.random;
import static java.lang.Math.PI;

public class C03importStatic {
    public static void main(String[] args) {
        //중첩클래스와 관련없이
        //잠깐 다른길로 빠짐...

        double random = Math.random();
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = random();
        //import static java.lang.Math.random; 이것을 임포트 하면 random 메소드앞에 Math를 붙일 필요가 없어진다.
        double pi4 = PI;
    }
}
