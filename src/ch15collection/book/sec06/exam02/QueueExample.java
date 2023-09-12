package ch15collection.book.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Messege> messegeQueue = new LinkedList<>();

        messegeQueue.offer(new Messege("sendMail", "홍길동"));
        messegeQueue.offer(new Messege("sendSms", "신용권"));
        messegeQueue.offer(new Messege("sendKakaotalk", "감자바"));

        while (!messegeQueue.isEmpty()) {
            Messege messege = messegeQueue.poll();
            switch (messege.command) {
                case "sendMail" :
                    System.out.println(messege.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSms" :
                    System.out.println(messege.to + "님에게 SMS을 보냅니다.");
                    break;
                case "sendKakaotalk" :
                    System.out.println(messege.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }

    }
}
