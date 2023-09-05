package selfStudy.ch05.sec12;

public class WeekExample {
    public static void main(String[] args) {
        // 열거 타입의 변수를 선언
        Week today = null;

        // 열거 값 대입
        today = Week.TUESDAY;

        // 열거 값 비교
        if (today == Week.FRIDAY){
            System.out.println("오늘은 신나는 금요일 입니다.");
        }else {
            System.out.println("오늘은 금요일이 아닙니다.");
        }

        // 컴퓨터의 요일 정보 얻기

    }
}
