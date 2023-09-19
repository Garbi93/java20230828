package selfStudy.ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteOutstreamExample { // 바이트 출력 스트림
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test2.db")) {

            byte[] array = {10, 20, 30};
            // 배열을 통째로 출력가능
            os.write(array);    // 배열의 모든 바이트를 출력

            os.flush(); // 내부의 잔류 바이트를 출력
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
