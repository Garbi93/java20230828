package Algorithms.test;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i< numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j =i+1; j< numRows-1; j++) {
                //row.add()
            }
        }


//        List<Integer> row1 = new ArrayList<>();
//        List<Integer> row2 = new ArrayList<>();
//        List<Integer> row3 = new ArrayList<>();
//        List<Integer> row4 = new ArrayList<>();
//        List<Integer> row5 = new ArrayList<>();
//
//        row1.add(1);
//
//        row2.add(1);
//        row2.add(1);
//
//        row3.add(1);
//        row3.add(row2.get(0)+row2.get(1));
//        row3.add(1);
//
//        row4.add(1);
//        row4.add(row3.get(0)+row3.get(1));
//        row4.add(row3.get(2)+row3.get(3));
//        row4.add(1);
//
//        row5.add(1);
//        row5.add(row4.get(0)+ row4.get(1));
//        row5.add(row4.get(1)+ row4.get(2));
//        row5.add(row4.get(2)+ row4.get(3));
//        row5.add(1);
//
//
//        list.add(row1);
//        list.add(row2);
//        list.add(row3);
//        list.add(row4);
//        list.add(row5);
//
//        System.out.println(list);




        return list;
    }
}
