package selfStudy.ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
    // 문자 입력 예제 (읽어들이기)
    public static void main(String[] args) {
        Reader reader = null;
        try{
            reader = new FileReader("C:/Temp/test.txt");
            // 문자 하나씩 읽기
            while (true) {
                int data = reader.read();
                if(data == -1 ) break;
                System.out.println((char)data);
            }
            reader.close();
            System.out.println();


            reader = new FileReader("C:/Temp/test.txt");
            // 문자 배열로 읽기
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if(num == -1) break;
                for(int i=0; i<num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
