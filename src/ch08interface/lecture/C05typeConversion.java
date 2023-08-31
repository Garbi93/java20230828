package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        // 상위타입으로 형변환
        Object o = i;
        Number n = i;
        Serializable ser = i;
        Comparable<Integer> cI = i;
        Constable cons = i;
        ConstantDesc coDe = i;

    }
}
