package ch07extends.book.sec08;

public class SmartPhone extends Phone{
    public SmartPhone(String model , String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model,String color) 생성자 실행됨");
    }
}
