package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void getAverageTest() {
        //Given
        int[] numbers = new int[6];
        for(int n=0;n<6;n++){
            numbers[n]=n;
        }
        //When
     double resoult=  ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(2.5,resoult,0.001);

    }
}