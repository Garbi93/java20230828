package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";
        try (OutputStream os = new FileOutputStream(path)) {

            byte[] b = {65, 66, 67, 68, 69};
            // 배열 b를 모두 출력
            os.write(b);
            // 배열 b 의 0인덱스 부터 3개의 인덱스까지
            os.write(b, 0, 3);
            // 배열 b 의 2인덱스 부터 3개의 인덱스까지
            os.write(b, 2, 2);

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
