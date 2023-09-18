package ch18io.book.q7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Examaple {
    public static void main(String[] args) throws IOException {
        String filePath = "src/ch18io/book/q7/Examaple.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber =0;   // 행번호
        String rowData;     // 스트링변수
        while (true) {
            rowData = br.readLine();    // 파일을 한줄씩 읽겠다
            rowNumber++;                // 행 줄을 하나씩 늘려서
            if(rowData == null) {
                break;
            }
            System.out.printf("%2d: %s%n", rowNumber, rowData);
        }
        br.close();
        fr.close();
    }
}
