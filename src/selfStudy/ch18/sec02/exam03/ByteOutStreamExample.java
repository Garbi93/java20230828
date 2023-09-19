package selfStudy.ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteOutStreamExample {
    // 배열의 일부분을 출력해보자
    public static void main(String[] args) {
        try(OutputStream os = new FileOutputStream("C:/Temp/test3.db");){
            byte[] array = {10,20,30,40,50};
            os.write(array, 1,3);    // 1번인덱스부터 3개
        }catch (Exception e) {
            e.printStackTrace();
        }

    }



}
