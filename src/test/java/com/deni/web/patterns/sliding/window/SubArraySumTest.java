package com.deni.web.patterns.sliding.window;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArraySumTest {

    private SubArraySum subArraySum;

    @BeforeEach
    void setUp() {
        subArraySum = new SubArraySum();
    }

    @Test
    void givenArrayAndConsecutiveElements_ShouldReturnMaximumSum() {
        int[] inputValues = {3,4,2,6,7,1,3,4,7,8,9,6,5,4,3};
        int result = subArraySum.maxSubArraySum(inputValues, 4);
        assertEquals(30, result);
    }
}