package ch09nested.book.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다");
            }
        }

        btnOk.setClickLitsener(new OkListener());

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("취소 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickLitsener(new CancelListener());

        btnCancel.click();
    }
}
