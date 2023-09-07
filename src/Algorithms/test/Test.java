package Algorithms.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 총 바구니 수
        int m = sc.nextInt();    // 도현이가 공을 던질 횟수
        int[] A = new int[n];    // 총 바구니 수만큼 값이 들어감

        for(int p=0; p<m; p++) {
            // 바구니 수만큼 i,j,k 값을 읽는다.
            int i = sc.nextInt();                   // k번이 적힌 공이 들어갈 첫 바구니
            int j = sc.nextInt();                   // k번이 적힌 공이 들어갈 마지막 바구니
            int k = sc.nextInt();                   // 공에 적힌 번호
            for(int q=i-1; q<j; q++){               // i 번부터 j 번까지 의 바구니에 k를 넣을것
                A[p] = k;                           // A[p]배열마다 k값을 덮어 씌운다
            }
        }
        for(int p = 0; p < m; p++) {
            System.out.println(A[p]);
        }
    }
}
