package PracticeJava.P8_30.P01_polymorphism_override;


public class PolyOver {
    public static void main(String[] args) {
        Ramen ramen = new Ramen();
        //ramen.select();

        ramen.brand = new Nongsim();
        ramen.select();

        ramen.brand = new Ottugi();
        ramen.select();

    }
}

class Ramen {
    public Brand brand;
    public void select () {
        brand.choseBrand();
    }
}

class Brand {
    public void choseBrand () {
        System.out.println("무슨 라면브랜드를 골랐나요??");
    }
}

class Nongsim extends Brand {
    @Override
    public void choseBrand() {
        System.out.println("농심입니다.");
    }
}

class Ottugi extends Brand {
    @Override
    public void choseBrand() {
        System.out.println("오뚜기 입니다.");
    }
}
