package selfStudy.ch18.sec06;

import java.io.*;

public class CharactorConvertStreamExample {
    public static void main(String[] args) throws IOException {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }
    // 바이트 타입 -> 문자 타입 (내보내기)
    public static void write(String str) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os);
        writer.write(str);
        writer.flush();
        writer.close();
    }


    // 문자 타입 -> 바이트 타입 (읽어 들이기)
    public static String read() throws IOException {

        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is);

        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data,0,num);
        return str;

    }
}
