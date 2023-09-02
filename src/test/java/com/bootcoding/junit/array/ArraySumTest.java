package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1,2,3,4,5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);

    }

    @Test
    public void test2(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {1,2,3,4,5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = -15;
        assertEquals(expectedSum,actualSum);

    }

}