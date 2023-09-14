package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        // OutputStream : 바이트 단위 출력 스트림
        try {
            // 데이터가 나가니깐 작성 하는 것
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70);
            os.write(71);
            os.write(73);
            // 스트림은 사용한후 꼭 닫아줘야한다.
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
