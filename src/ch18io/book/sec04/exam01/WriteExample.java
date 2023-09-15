package ch18io.book.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {

            char a = 'A';
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(("FGH"));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
