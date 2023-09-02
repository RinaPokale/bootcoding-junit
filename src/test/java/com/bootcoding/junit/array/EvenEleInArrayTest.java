package com.bootcoding.junit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EvenEleInArrayTest {
    @Test
    public void test(){
        EvenEleInArray eleInArray = new EvenEleInArray();
        int[] num = {1, 2, 4, 5, 6, 7};
        List<Integer> actualList = eleInArray.getEvenEle(num);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(2, 4, 6));
        assertEquals(actualList, expectedList);
    }
}