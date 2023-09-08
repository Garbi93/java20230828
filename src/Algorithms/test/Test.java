package Algorithms.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(int[] candies, int extraCandies) {
        int[] gop = new int[candies.length];
        Boolean[] B = new Boolean[candies.length];
        for(int i =0; i < candies.length; i++) {
            gop[i] = candies[i] *3;
        }
        for(int i =0; i< candies.length; i++) {
            for(int j =0; j <  candies.length; j++ ) {
                if(gop[i] > candies[j]){
                    B[i] = true;
                }else {
                    B[i] = false;
                }
            }
        }

    }
}
