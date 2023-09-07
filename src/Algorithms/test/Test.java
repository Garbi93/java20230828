package Algorithms.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[28];
        int[] B = new int[30];
        int n;
        while (true) {
            for(int i = 0; i< 30; i++) {
                B[i] = i+1;
                n = sc.nextInt();
                A[i] = n;
            }
            for(int i = 0; i< 30; i++) {
                for(int j=0; j<30; j++){
                    if(B[i] != A[i]){
                        System.out.println(A[i]);
                    }
                }
            }

        }

    }
}
