package ch18io.book.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        String path = "C:/Temp/text1.db";
        try (OutputStream os = new FileOutputStream(path)) {
            byte[] array = {10, 20, 30};
            os.write(array);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
