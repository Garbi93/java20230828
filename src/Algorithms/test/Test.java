package Algorithms.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int max = a[0];
        int index = 1;
        for(int i = 0; i < 9; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i< 9; i++){
            if(a[i]> max){
                max = a[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
