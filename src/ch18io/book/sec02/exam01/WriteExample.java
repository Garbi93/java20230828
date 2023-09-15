package ch18io.book.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        String temp ="C:/Temp/test2.db";
        try (OutputStream os = new FileOutputStream(temp)) {

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            // flush 어디론가 데이터를 이동시키는 역할 한번에 가는 경우도 있지만 안가는 경우도 있다
            // 나오는 데이터가 모이는곳을 buffer라고 하는데 flash 메소드를 만나면 buffer영역에 있던 것을 목적지로 전달한다.
            // InputStream은 flush를 안쓴다.

            //os.close();//try - with -resource 문법
                         // 코드가 오류가 나든 안나든 close를 꼭 실행시켜준다.
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
