package com.deni.web.patterns.multiple.pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUniqueValueTest {

    private CountUniqueValue countUniqueValue;

    @BeforeEach
    void setUp() {
        countUniqueValue = new CountUniqueValue();
    }

    @Test
    void givenSortedArray_ShouldReturnCountOfUniqueCharacters() {
        int[] sortedArray = {-2, -2, 0, 1, 1, 2, 4};
        int result = countUniqueValue.countUniqueValue(sortedArray);
        assertEquals(5, result);
    }
}