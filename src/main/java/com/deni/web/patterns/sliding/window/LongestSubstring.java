package com.deni.web.patterns.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    /**
     * Get longest substring with non repeating characters
     *
     * @param wholeString String with repeating characters
     * @return Longest substring with non-repeating characters
     */
    public String getLongestSubstring(String wholeString) {
        Map<Character, Integer> visitedChars = new HashMap<>();
        String output;
        int startPos = 0;
        int endPos = 0;
        int tempStartPos = 0;
        for (int i = 0; i < wholeString.length(); i++) {
            char currentCharacter = wholeString.charAt(i);
            if (visitedChars.containsKey(currentCharacter)) {
                tempStartPos = visitedChars.get(currentCharacter) + 1;
            }
            if (i - tempStartPos > (endPos - startPos)) {
                startPos = tempStartPos;
                endPos = i + 1;
            }
            visitedChars.put(currentCharacter, i);
        }
        output = wholeString.substring(startPos, endPos);
        return output;
    }
}
