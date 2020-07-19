package com.deni.web.patterns.frequency.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleOfArrayTest {

    private DoubleOfArray doubleOfArray;

    @BeforeEach
    void setUp() {
        doubleOfArray = new DoubleOfArray();
    }

    @Test
    void givenSecondArrayHasInputsWithDoubleTheFirst_ShouldReturnTrue_WhenUsingIsDouble() {
        int[] singleNumberArrays = {2, 4, 6};
        int[] doubleNumberArrays = {12, 4, 8};
        boolean result = doubleOfArray.isDouble(singleNumberArrays, doubleNumberArrays);
        assertTrue(result);
    }

    @Test
    void givenSecondArrayNotHaveInputsWithDoubleTheFirst_ShouldReturnFalse_WhenUsingIsDouble() {
        int[] singleNumberArrays = {2, 4, 6};
        int[] doubleNumberArrays = {12, 9, 4};
        boolean result = doubleOfArray.isDouble(singleNumberArrays, doubleNumberArrays);
        assertFalse(result);
    }

    @Test
    void givenArraySizeDoesntMatch_ShouldReturnFalse_WhenUsingIsDouble() {
        int[] singleNumberArrays = {2, 4, 6};
        int[] doubleNumberArrays = {12, 9};
        boolean result = doubleOfArray.isDouble(singleNumberArrays, doubleNumberArrays);
        assertFalse(result);
    }

    @Test
    void givenInputsAreEmptyArrays_ShouldReturnTrue_WhenUsingIsDouble() {
        int[] singleNumberArrays = new int[2];
        int[] doubleNumberArrays = new int[2];
        boolean result = doubleOfArray.isDouble(singleNumberArrays, doubleNumberArrays);
        assertFalse(result);
    }

}