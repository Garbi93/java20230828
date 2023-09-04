package ch16lambda.book.q7;

public class Example {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(Operrator operrator) {
        int result = scores[0];
        for(int score : scores){
            result = operrator.apply(result, score);
//            result = (result < score) ? score : result;
        }
        return result;
    }

    public static void main(String[] args) {
//        int max = maxOrMin((x,y)->(x<y)? y : x);
        int max = maxOrMin((x,y)->Math.max(x,y));
        System.out.println("최대값 = " + max);

        int min = maxOrMin((x,y)-> Math.min(x,y));
        System.out.println("최소값 = " + min);
    }
}
