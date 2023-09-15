package ch18io.lecture;

import java.io.*;

public class C21copy {
    public static void main(String[] args) {

        // BuffaeredInputStream
        // BufferdOutputStream
        // 그림 파일 복사 코드
        String src1  = "C:/Temp/testImg.jpg";
        String des2 = "C:/Temp/testImgCopy.jpg";
        try {
            FileInputStream fis = new FileInputStream(src1);
            FileOutputStream fos = new FileOutputStream(des2);
            BufferedInputStream bis  = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            try (fis; fos; bis; bos){
                byte[] buf = new byte[1024];
                int len = 0;
                long start = System.currentTimeMillis();
                while((len = bis.read(buf))!= -1) {
                    bos.write(buf, 0, len);
                }
                bos.flush();
                long end = System.currentTimeMillis();
                System.out.println("걸린시간 : "+(end-start));

            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
