package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumEleInArrayTest {
    @Test
    public void test(){
        MaximumEleInArray maximumEleInArray = new MaximumEleInArray();
        int[] num = {2, 4, 5, 7, 30};
        int actualMax = maximumEleInArray.getMaxEle(num);
        int expectedMax = 30;
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void test2(){
        MaximumEleInArray maximumEleInArray = new MaximumEleInArray();
        int[] num = {2, 4, 5, 7, 30};
        int actualMax = maximumEleInArray.getMaxEle(num);
        int expectedMax = 5;
        assertEquals(expectedMax, actualMax);

    }
}