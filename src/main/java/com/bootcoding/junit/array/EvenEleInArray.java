package com.bootcoding.junit.array;

import java.util.ArrayList;
import java.util.List;

public class EvenEleInArray {
    public List<Integer> getEvenEle(int[] num){
        List list = new ArrayList<>();
        for(int n: num){
            if(n % 2 == 0){
                list.add(n);
            }
        }
        return list;
    }
}
