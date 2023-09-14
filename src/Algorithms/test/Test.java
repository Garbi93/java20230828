package Algorithms.test;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] pare = new int[10];
        for(int a: arr) {
            a = sc.nextInt();
        }
        for(int p: pare) {
            p = arr[p]%42;
        }
        for(int i = 0; i< 10; i++) {
            System.out.println(arr[i]);
            System.out.println(pare[i]);
        }
    }
}
