package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1 () {
        // 익셉션이 발생하나 안하나 이므로 final 에서 os.close 를 해주자
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

    // try - with -resource 문법
    // 위의 method1 을 간단하게 만든것
    public void method2 () {
        // try - with -resource 문법
        // 코드가 오류가 나든 안나든 close를 꼭 실행시켜준다.
        // close를 안써도 자동으로 닫아진다
        // try - with -resource의 변수의 타입은 AutoCloseable이어야 한다.
        try(OutputStream os = new FileOutputStream("");) {
            os.write(33);
            os.write(67);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void method3 () {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
        ) {
            fos.write(234);
            fis.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner) { // 값이 한번만 할당 될때에는 변수명만 넣어도 괜찮다.(effectivly final과 같은 효과)
            scanner.hasNext();
            scanner.nextInt();
        }
    }

    // 기존 방식
    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fio; fos) {
                fio.read();
                fos.write(33);
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 이런식의 try catch 생략은 사용 은 가는하나 권장하지 않는 방식이다.
    public void method6() throws IOException {
        // 안좋은 코드임
        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        // 이런식으로 작성하면 write에서 익셉션이 발생하면 아래의 close의 코드가 실행을 안하고 throws로 바로 넘어가기 때문에
        // 이런방식은 권장되지 않는다.
        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }



}
