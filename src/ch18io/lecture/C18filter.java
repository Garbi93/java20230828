package ch18io.lecture;

import java.io.*;

public class C18filter {
    public static void main(String[] args) {
        // 보조 스트림 (filter stream)
        // : 다른 스트림을 변환하는 스트림

        try {

            // 다른 스트림을 받아서 변경해주는것
           try (OutputStream os = getOutStream("C:/Temp/out8.txt");) {
                OutputStreamWriter osw = new OutputStreamWriter(os);
                osw.write('손');
                osw.write('흥');
                osw.write('민');
                osw.flush();
           }
        }catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public static OutputStream getOutStream (String file) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(file);
        return os;
    }
}
