package ch18io.lecture;

import java.io.File;

public class C31mkdirs {
    // 한번에 여러 폴더를 만들때
    public static void main(String[] args) {
        // mkdirs 여러 디렉토리 한번에 만들기
        String path = "C:/Temp/test1/test2/test3";
        File file = new File(path);
        System.out.println("file.exists() = " + file.exists());
        if(!file.exists()) {
            file.mkdirs();  // mkdir 을 넣으면 생성아 안되고 mkdirs를 넣어야 만들 수 있다.
        }
    }
}
