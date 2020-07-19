package com.deni.web.patterns.frequency.counter;

import java.util.HashMap;
import java.util.Map;

public class DoubleOfArray {

    /**
     * Return true if second array contains all members that are double of the members in first array
     * The number of elements in the input arrays should match
     * The order of elements in the input elements may not match
     *
     * @param inputSingleValues Original array
     * @param inputDoubleValues Array that contains 2 * values of first array
     * @return True if if second array contains all members that are double of the members in first array
     */
    public boolean isDouble(int[] inputSingleValues, int[] inputDoubleValues) {
        boolean isDoubleValueArray = false;
        if (inputSingleValues.length == inputDoubleValues.length) {
            Map<Integer, Integer> inputSingleValuesFrequency = new HashMap<>();
            Map<Integer, Integer> inputDoubleValuesListFrequency = new HashMap<>();
            populateInputLists(inputSingleValues, inputDoubleValues, inputSingleValuesFrequency, inputDoubleValuesListFrequency);
            isDoubleValueArray = true;
            for (int singleValue : inputSingleValues) {
                if (!inputSingleValuesFrequency.get(singleValue)
                        .equals(inputDoubleValuesListFrequency.get(2 * singleValue))) {

                    isDoubleValueArray = false;
                }
            }
        }

        return isDoubleValueArray;
    }

    private void populateInputLists(int[] inputSingleValues, int[] inputDoubleValues, Map<Integer, Integer> inputSingleValuesFrequency, Map<Integer, Integer> inputDoubleValuesListFrequency) {
        for (int singleValue : inputSingleValues) {
            if (inputSingleValuesFrequency.containsKey(singleValue)) {
                int frequency = inputSingleValuesFrequency.get(singleValue);
                inputSingleValuesFrequency.put(singleValue, ++frequency);
            } else {
                inputSingleValuesFrequency.put(singleValue, 1);
            }
        }

        for (int doubleValue : inputDoubleValues) {
            if (inputDoubleValuesListFrequency.containsKey(doubleValue)) {
                int frequency = inputSingleValuesFrequency.get(doubleValue);
                inputDoubleValuesListFrequency.put(doubleValue, ++frequency);
            } else {
                inputDoubleValuesListFrequency.put(doubleValue, 1);
            }
        }
    }
}
