package ch09nested.book.sec06.exam02;

public class Button {
    private ClickListener clickListener;

    public static interface ClickListener {
        //void ClickListener clickListener;

    }
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
