package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03trywithresource {
    public void method1 () {
        // 익셉션이 발생하나 안하나 이므로 final 에서 os.clost 를 해주자
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // os 변수를 선언한 블럭에서만 사용 가능
            try {
                os.close(); // io stream을 꼭 닫아야함
            } catch (IOException e) {
                // final에 close를 넣으면 try catch를 해야한다
                throw new RuntimeException(e);
                // 하지만 트라이 캐치가 너무 길어서 대안은 아래에
            }
        }
    }

    // 위의 method1 을 간단하게 만든것
    public void method2 () {
        // try - with -resource 문법
        // 코드가 오류가 나든 안나든 close를 꼭 실행시켜준다.
        try(OutputStream os = new FileOutputStream("");) {
            os.write(33);
            os.write(67);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
