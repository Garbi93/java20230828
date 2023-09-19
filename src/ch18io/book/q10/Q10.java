package ch18io.book.q10;

import java.io.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        try{
            String path = "C:/Temp/photo1.jpg";
            File file = new File(path);
            String dec = "C:/Temp/photo2.jpg";



            System.out.printf("원본 파일 경로: %s%n",path);
            System.out.printf("복사 파일 경로: %s%n",dec);

            if(file.exists()){
                FileReader reader = new FileReader(path);
                BufferedReader br = new BufferedReader(reader);
                FileWriter writer = new FileWriter(dec);
                BufferedWriter bw = new BufferedWriter(writer);
                System.out.printf("복사가 성공되었습니다%n");
            }else {
                System.out.printf("원본파일이 존재하지 않습니다.%n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

         */

        //
        String srcPath = "";
        String desPath = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일 경로 : ");
        srcPath = sc.nextLine();

        System.out.print("복사 파일 경로 : ");
        desPath = sc.nextLine();


        // 다시한번 풀어보기
    }
}
