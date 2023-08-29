package ch07extends.book.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        // 오버라이딩 전 것을 갖고 오는것
        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r) );
        System.out.println();

        // 오버라이딩 한것을 갖고 오는것
        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
    }
}
