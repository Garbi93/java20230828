package ch09nested.book.sec07.exam03;

public class Button {
    public static interface ClickListener {
        void onClick();

    }
    private ClickListener clickLitsener;

    public void setClickLitsener(ClickListener clickListener) {
        this.clickLitsener = clickListener;
    }

    public void click() {
        this.clickLitsener.onClick();
    }
}
