package ru.faton.algorithm.longestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.longestSubstringWithoutRepeatingCharacters.Solution.lengthOfLongestSubstring;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(lengthOfLongestSubstring(" "), 1);
        assertEquals(lengthOfLongestSubstring("au"), 2);
    }
}
