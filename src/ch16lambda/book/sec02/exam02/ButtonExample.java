package ch16lambda.book.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(()->{
            System.out.println("오케이 버튼을 클릭했습니다.");
        });

        btnOk.click();
    }
}
