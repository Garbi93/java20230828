package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c= "java";
        String s = (String) c; // ok
        Object o = (Object) c;
        Constable con = (Constable) c;
        ConstantDesc cd = (ConstantDesc) c;
        Serializable sb = (Serializable) c;


        //Number n = (Number) c;  // Number 타입으로 강제 형변환 하면 문법상은 맞지만 오류가 나온다 -매우위험-

        System.out.println("프로그램 종료");
    }
}
