package selfStudy.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamCopyExample {
    // 파일 복사 예제
    public static void main(String[] args) {
        try {
            String isPath = "C:/Temp/testPhoto1.jpg";
            InputStream is = new FileInputStream(isPath);
            String tagetPath = "C:/Temp/test-OutputStream.jpg";
            OutputStream os = new FileOutputStream(tagetPath);


            try (is; os) {
                byte[] data = new byte[100];
                while (true) {
                    int num = is.read(data);
                    // 파일명을 읽는게 아니라 파일 안의 데이터를 읽는다는것을 기억하자
                    if (num == -1) break;
                    os.write(data,0,num); // 배열의 처음부터 num까지 출력하자
//                    for(int i =0; i < num; i++){
//                        System.out.println(data[i]);
//                    }
                }

            }
            os.flush();
            System.out.println("데이터의 복사가 완료 되었습니다.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
