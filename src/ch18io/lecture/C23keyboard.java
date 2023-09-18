package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class C23keyboard {
    public static void main(String[] args) {
        try{
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);
            // 위의 세줄을 이런식으로 한줄로 작성 가능
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try(br; isr) {
                // readLine -> 한줄씩 읽는다
                String line1 = br.readLine();
                System.out.println("line1 = " + line1);

                String line2 = br.readLine();
                System.out.println("line2 = " + line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
