package ch19network.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.81", 7000);

            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream);
            BufferedWriter bw = new BufferedWriter(writer);

            Scanner sc = new Scanner(System.in);
            try (socket; writer; bw; outputStream; sc) {
                while (true) {
                    System.out.print("입력 > ");
                    String chat = sc.nextLine();
                    bw.write(chat);
                    bw.newLine();
                    bw.flush();

                    if (chat.equals("bye")) {
                        break;
                    }
                }

            }
        }catch (Exception e) {
            e.printStackTrace();
        }




    }
}
