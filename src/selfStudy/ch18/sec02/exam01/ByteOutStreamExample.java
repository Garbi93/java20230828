package selfStudy.ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutStreamExample {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:/Temp/test1.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 바이트 하나하나 출력
            os.write(a);
            os.write(b);
            os.write(c);    // 현관까지 나간상태

            os.flush();     // write된 내용을 진짜로 내보내는 것
            os.close();     // 내보내면 문 닫기
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
