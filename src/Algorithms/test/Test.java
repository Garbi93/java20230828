package Algorithms.test;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n 은 총 바구니 수
        // m 은 바구니를 역순으로 만들 횟수
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arrM = new int[n];
        int revers = 0;
        for(int I = 0; I < n; I++){
            arrM[I] = I+1;
        }
        for(int I=0; I< m; I++) {
            int i =sc.nextInt();
            int j = sc.nextInt();
            //revers = arrM[]
        }
    }
}
