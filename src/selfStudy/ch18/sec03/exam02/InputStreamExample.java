package selfStudy.ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {
    // 배열 byte를 읽어 들이기
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {

            byte[] arr = new byte[100];

            while (true) {
                int num = is.read(arr); // 한번에 100byte를 읽는다 num에는 3만 저장된다 3개 밖에 없어서
                if (num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(arr[i]);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
