package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 = new Car ("tesla",5000);
        Car car2 = new Car ("kia",3000);
        Car car3 = new Car ("bmw",2000);

        // 아래의 세줄을 대신하는게 toString()메소드
        System.out.println(car1.getModel() + " : " + car1.getPrice());
        System.out.println(car2.getModel() + " : " + car2.getPrice());
        System.out.println(car3.getModel() + " : " + car3.getPrice());

        System.out.println("=========================================");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}

class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

//    @Override
//    public String toString() {
//        return this.model + " : " +this.price;
//    }


    // alt + insert 단축키를 붙여서 바로만든것
    // 객체를 설명하는 문자열 리턴 하는메소드
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
