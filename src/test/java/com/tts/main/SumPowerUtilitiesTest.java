package com.tts.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SumPowerUtilitiesTest {

    @BeforeEach
    void setUp() {
        System.out.println("Testing...");
    }

    @Test
    void getSizeAndNumbersTest() {
    }

    @Test
    void mySumTest() {
        double[] testArray = {1, 2, 5, -10, 1.5};
        assertEquals(-0.5, SumPowerUtilities.mySum(testArray));
    }

    @Test
    void toPowerTest() {
        int[] expectedArray = {0, 1, 8, 27};
        assertEquals(expectedArray, SumPowerUtilities.toPower(4, 3));
    }
    //TODO: work on toPowerTest()


}//end SumPowerUtilitiesTest class