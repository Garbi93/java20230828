package selfStudy.lambda.sec02.exam02;

import ch16lambda.book.sec02.exam02.Button;

public class ButtonExample {
    public static void main(String[] args) {
        // ok버튼 객체 생성
        Button btnOk = new Button();
        // ok버튼 객체에 람다식 Clicklistener익명 구현 객체 주입
        btnOk.setClickListener(()->{
            System.out.println("ok 버튼이 클릭 되었습니다.");
        });
        // ok 버튼 클릭
        btnOk.click();

        Button btnCancel =new Button();
        btnCancel.setClickListener(()-> System.out.println("cancel버튼이 클릭 되었습니다."));
        btnCancel.click();
    }
}

class Buttton {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click () {
        this.clickListener.onClick();
    }

}


