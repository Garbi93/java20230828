package ch11exception.lecture;

public class C24custom {
    public static void main(String[] args) {
        // 메세지 만들기
        int money = 300;
        if (money < 10000) {
            throw new LackOfMoneyException("돈이 부족해");
        }
    }
}
