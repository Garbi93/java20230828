package ch18io.book.sec03.exam03;

import java.io.*;

public class CopyExample {
    // 이렇게 쓰라고 권장하라는 것이 아니라 이렇게 사용 할 수도 있다는것을 보여주는것
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);

            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) {
                    break;
                }
                os.write(data, 0, num);
            }

            os.flush();
            os.close();
            is.close();

            System.out.println("복사가 잘 되었습니다.");

    }
}
