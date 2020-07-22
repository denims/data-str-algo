package com.deni.web.patterns.sliding.window;

public class SubArraySum {

    /**
     * Calculate the maximum sum of consecutive elements in the passed array
     * Based on the number of consecutive elements passed in input
     *
     * @param inputValues         Array of integers
     * @param consecutiveElements Number of consecutive elements
     * @return max sum of consecutive elements
     */
    public int maxSubArraySum(int[] inputValues, int consecutiveElements) {
        int sumOfElements = 0;
        if (inputValues.length < consecutiveElements) {
            return sumOfElements;
        }
        for (int i = 0; i < consecutiveElements; i++) {
            sumOfElements += inputValues[i];
        }
        int tempSum = sumOfElements;

        for (int i = consecutiveElements; i < inputValues.length; i++) {
            tempSum = tempSum - inputValues[i - consecutiveElements] + inputValues[i];
            sumOfElements = Math.max(sumOfElements, tempSum);
        }

        return sumOfElements;
    }
}
