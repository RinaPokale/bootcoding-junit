package com.bootcoding.junit.array;

public class MaximumEleInArray {
    public int getMaxEle(int[] num){
        int max = Integer.MIN_VALUE;
        for(int n: num){
            max = Math.max(max, n);
        }
        return max;
    }
}
