package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out1.txt";
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(70);   // int 타입으로받고 1byte로 잘라서 저장
            os.write(71);   // 1byte로 잘라서 저장
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
