package ch12api.lecture;

import java.util.Scanner;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x"));   // true
        System.out.println("a".matches("a"));   // true
        System.out.println("a".matches("x"));   // false a라는 문자를 x라는 패턴과 다르다
        System.out.println();

        // 문자들
        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("x")); // false
        System.out.println();

        // 수량자 -> 특정 글자가 몇번 나오는지 확인하고 싶을때
        // quantifiers
        System.out.println("xxx".matches("x{3}"));  // true
        System.out.println("aaa".matches("a{3}"));  // true
        System.out.println("aa".matches("a{3}"));   // false
        // 범위를 쓰고 싶다
        System.out.println("aaa".matches("a{1,3}"));    // true -> a가 1~3까지 나오는것도 괜찮다.
        System.out.println();

        // 활용
        System.out.println("dog".matches("do{1,3}g"));  //true
        System.out.println("dooog".matches("do{1,3}g"));    //true
        System.out.println("doog".matches("do{1,3}g")); //true

        System.out.println("dodog".matches("do{1,3}g"));    // false
        System.out.println();

        // 그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g")); // true
        System.out.println("dog".matches("(do){1,3}g")); // true
        System.out.println("dododog".matches("(do){1,3}g")); // true
        System.out.println();

        // 수량 :
        System.out.println("dog".matches("do{1,}g"));   // 1개 이상 있으면 true
        System.out.println("doooog".matches("do{1,}g"));   // 1개 이상 있으면 true
        System.out.println("dooooooooog".matches("do{1,}g"));   // 1개 이상 있으면 true
        System.out.println("doog".matches("do{1,}g"));   // 1개 이상 있으면 true
        System.out.println();

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g"));   // true
        System.out.println("dog".matches("do?g"));  // true
        System.out.println("doog".matches("do?g")); // false
        System.out.println();

        // * : 0번 이상
        System.out.println("dg".matches("do*g"));   // true
        System.out.println("dog".matches("do*g"));   // true
        System.out.println("doog".matches("do*g"));   // true
        System.out.println("doooog".matches("do*g"));   // true
        System.out.println();

        // + : 1번 이상
        System.out.println("dg".matches("do+g"));   // false
        System.out.println("dog".matches("do+g"));   // true
        System.out.println("doog".matches("do+g"));   // true
        System.out.println("doooog".matches("do+g"));   // true
        System.out.println();

        // 문자 분류(character classes)[]
        System.out.println("dog".matches("d[oi]g"));   // true
        System.out.println("dig".matches("d[oi]g"));
        // true로 만들고 싶다.면 []로 하고싶은 글자를 묶어주면 된다.
        System.out.println();

        //[^]
        System.out.println("dog".matches("d[^oi]g"));   // false
        System.out.println("dig".matches("d[^oi]g"));   // false 대괄호 안에 들어있는 글자가 아닐때만 true
        System.out.println("deg".matches("d[^oi]g"));   // true
        System.out.println();

        System.out.println("dog".matches("d[a-z]g"));   // true -> a~z까지 다 true
        System.out.println("dwg".matches("d[a-z]g"));   // true
        System.out.println("drg".matches("d[a-z]g"));   // true
        System.out.println();

        System.out.println("dag".matches("d[a-cx-z]g"));    // a~c , x~z 안에 들어가는것만 true
        System.out.println("ddg".matches("d[a-cx-z]g"));    // a~c , x~z 안에 들어가는것만 true
        System.out.println();

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));   // true // 0~ 9까지 true
        System.out.println("0".matches("[0-9]"));   // true
        System.out.println("2".matches("\\d"));     // true // [0-9]와 같은 띁이다.
        System.out.println();

        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w")); //[a-zA-Z_0-9]와 \\w 는 같다
        System.out.println("8".matches("\\w"));
        System.out.println();

        // 예제 :  숫자로 시작하면 안되고, 영문대소문자, _,$만 들어가게
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern));   // true
        System.out.println("_".matches(pattern));   //true
        System.out.println("1".matches(pattern));   //false
        System.out.println();

        // 전화번호 패턴
        String pattern1 = "[0-9]{2,3}[-]{0,1}[0-9]{3,4}[-]{0,1}[0-9]{4}";
        System.out.println("0101234678".matches(pattern1));
        System.out.println("010-1234-678".matches(pattern1));   // 뒷 자리는 4자리 이상 이어야 한다.
        System.out.println("010-234-5678".matches(pattern1));
        System.out.println("010-1234-5678".matches(pattern1));
        System.out.println("010-234-5678".matches(pattern1));
        System.out.println("02-234-5678".matches(pattern1));
        System.out.println("0-234-5678".matches(pattern1));     // 첫 자리는 2개 이상 이어야 한다
        System.out.println("0111-234-5678".matches(pattern1));     // 첫 자리는 2개 이상 3개 이하 이어야 한다
        System.out.println();

        // 모든 문자 : .
        System.out.println(" ".matches("."));   // true
        System.out.println("a".matches("."));   // true
        System.out.println("3".matches("."));   // true
        System.out.println("+".matches("."));   // true
        System.out.println(".".matches("."));   // true
        System.out.println();

        // . : \.   -> .만 true로 표현하고 싶을땐
        System.out.println(".".matches("\\."));
        System.out.println(" ".matches("\\."));
        System.out.println("s".matches("\\."));
        System.out.println();

        // 이메일 패턴
        // 영문소문자, 숫자가 여러개 @ 영문소문자,숫자 여러개 . 영문소문자,숫자 여러개
        String pattern2 = "\\w*\\d*[@]{1}\\w*\\d*\\.{1}\\w*\\d*";
        System.out.println("asd123@asd123.asd123".matches(pattern2));   // true
        System.out.println("asd123asd123.asd123".matches(pattern2));    // @가 없어서 false
        System.out.println("asd123@asd123asd123".matches(pattern2));    // . 이 없어서 false
        System.out.println("@asd123asd123".matches(pattern2));          // @앞에 영문 숫자 둘다 없어서 false
        System.out.println("123@asd123asd123".matches(pattern2));       // 숫자가 먼저와서 false
        System.out.println("asdf123@asd123.asd123".matches(pattern2));  // true
        System.out.println();

        // or : |
        System.out.println("sdfdogsd".matches(".*dog.*"));
        System.out.println("123catekjr".matches(".*cat.*"));
        System.out.println("sdfdogsd".matches(".*(dog|cat).*"));
        System.out.println("123dogekjr".matches(".*(cat|dog).*"));
        System.out.println();






    }
}
