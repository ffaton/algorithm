package ru.faton.algorithm.longestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.longestSubstringWithoutRepeatingCharacters.Solution.execute;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(execute("abcabcbb"), 3);
        assertEquals(execute("bbbbb"), 1);
        assertEquals(execute("pwwkew"), 3);
        assertEquals(execute(" "), 1);
        assertEquals(execute("au"), 2);
    }
}
