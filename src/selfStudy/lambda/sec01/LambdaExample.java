package selfStudy.lambda.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y)-> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
                int result = x * y;
                System.out.println(result);
        });

        action((x, y)-> {
            int result = x- y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Calculable calculable){
        int x = 10;
        int y =4;
        calculable.calculate(x,y);
    }
}

interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}
