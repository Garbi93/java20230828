package PracticeJava.P8_31;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int revN=n;
        int count=0;
        for (int i = 0; i < n; i++) {
            revN--;
            count++;
            for(int j = 0; j<revN; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< count; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
