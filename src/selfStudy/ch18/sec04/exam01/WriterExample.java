package selfStudy.ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    // 문자타입 데이터 출력
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {

            // 문자 출력
            char a = 'a';
            char b = 'b';
            writer.write(a);
            writer.write(b);

            // 문자 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            String str = "Java";
            writer.write(str);

            writer.flush();
            System.out.println("문자타입 데이터가 정상적으로 출력되었습니다.");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
