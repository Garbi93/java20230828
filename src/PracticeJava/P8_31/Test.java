package PracticeJava.P8_31;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 시간
        int b = sc.nextInt();   // 분
        int c = sc.nextInt();   // 추가 분


        if(b+c < 60) {
            b = b+c;
            System.out.println(a + " " + b);
        }
        else if (b+c >= 60) {
            int aC = a + (b+c)/60;
            int bC = (b+c)%60;
            if (aC >= 24) {
                aC = aC%24;
            }
            System.out.println(aC + " " + bC);
        }

    }
}
