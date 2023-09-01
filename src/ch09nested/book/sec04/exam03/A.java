package ch09nested.book.sec04.exam03;

public class A {



        public void method1 ( int arg){

            int var = 1;

            class B {
                void mehtod2() {
                    System.out.println("arg = " + arg);
                    System.out.println("var = " + var);

//                arg = 2;
//                var = 2;

                }
            }
            B b = new B();
            b.mehtod2();

//        arg =3;
//        var = 3;
        }

    public static void main(String[] args) {
        A a = new A();
        a.method1(5);
    }
}


