package com.deni.web.patterns.multiple.pointers;

public class CountUniqueValue {
    /**
     * Accepts a sorted array and returns the count of unique values in
     * the array
     *
     * @param sortedArray Sorted array input
     * @return count of unique values
     */
    public int countUniqueValue(int[] sortedArray) {
        //Instead of this logic, the array can be added to a set and the count of the set can be returned
        //Here the implementation is used to demonstrate multiple pointers pattern
        int count = 0;
        int prevValue = 0;
        boolean firstTime = true;
        for (int value : sortedArray) {
            if (firstTime) {
                prevValue = value;
                count++;
                firstTime = false;
            }
            if (prevValue != value) {
                count++;
                prevValue = value;
            }
        }

        return count;
    }
}
