package ch09nested.book.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        Button btnCancel = new Button();

        btnOk.setClickLitsener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼이 클릭되었습니다.");
            }
        });
        btnCancel.setClickLitsener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼이 클릭 되었습니다.");
            }
        });

        btnOk.click();
        btnCancel.click();

    }
}
