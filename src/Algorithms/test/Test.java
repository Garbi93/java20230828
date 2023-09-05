package Algorithms.test;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        int max =a[0];
        int count =1;
        for(int i=0; i< n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        for(int i =0; i< n; i++){
            if(max != a[i]){
                count++;
            }else {
                break;
            }
        }
        System.out.println(max);
        System.out.println(count-1);
    }
}
