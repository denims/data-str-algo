package com.deni.web.patterns.sliding.window;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    private LongestSubstring longestSubstring;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    void givenStringWithRepeatingCharacters_ShouldReturnLongestSubstring() {
        String input = "abcdefghijklmna";
        String result = longestSubstring.getLongestSubstring(input);

        assertEquals("abcdefghijklmn", result);
    }

    @Test
    void givenStringWithRepeatingCharactersInBetween_ShouldReturnLongestSubString() {
        String input = "abcdefghijklmnopqrstuvwxvz";
        String result = longestSubstring.getLongestSubstring(input);

        assertEquals("abcdefghijklmnopqrstuvwx", result);
    }

    @Test
    void givenStringWithRepeatingCharactersInBetweenCase2_ShouldReturnLongestSubString() {
        String input = "abcdefghijklmnopqrstuvaavz";
        String result = longestSubstring.getLongestSubstring(input);

        assertEquals("abcdefghijklmnopqrstuv", result);
    }

    @Test
    void givenStringWithSameRepeatingCharacterInBetween_ShouldReturnLongestSubString() {
        String input = "abcdefghijklmnopqrstuvvvvvv";
        String result = longestSubstring.getLongestSubstring(input);

        assertEquals("abcdefghijklmnopqrstuv", result);
    }

    @Test
    void givenStringWithNoRepeatingCharactersInBetween_ShouldReturnSameString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String result = longestSubstring.getLongestSubstring(input);

        assertEquals(input, result);
    }
}