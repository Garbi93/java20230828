package ch16lambda.book.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x,y)-> {
            double result = x +y;
            return result;
        });

        person.action((x , y)->(x/y));

        person.action(new Calcuable() {
            @Override
            public double calc(double x, double y) {
                return sum(x, y);
            }
        });
        person.action((x,y)->sum(x,y));
    }

    public static double sum(double x, double y){
        return (x-y);
    }
}
