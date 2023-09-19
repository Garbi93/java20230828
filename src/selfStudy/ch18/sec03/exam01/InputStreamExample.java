package selfStudy.ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {
    // InputStream 의 read 예제
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {
            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
