package ch18io.lecture;

import java.io.*;

public class C22filter {
    public static void main(String[] args) throws FileNotFoundException {
        // 계속 감싸기
        InputStream is = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        // 계속 감싸기
        OutputStream os = new FileOutputStream("");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        OutputStreamWriter osw = new OutputStreamWriter(bos);
    }
}
