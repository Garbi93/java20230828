package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        // outputstream과 비교
        String file1 = "c:/Temp/out5.txt";
        String file2 = "c:/Temp/out6.txt";

        try {
            OutputStream os = new FileOutputStream(file1);
            Writer writer = new FileWriter(file2);
            try(os; writer) {
                os.write(65);
                writer.write(65);

                os.write(48124);
                // byte 단위로 잘라서 갖고 오기때문에 정상 출력되지 않는다.
                writer.write(48124);
                // 문자단위로 작성해서 정상 출력 된다

                os.flush();
                writer.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
