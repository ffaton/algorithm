package ru.faton.algorithm.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.palindromeNumber.Solution.isPalindrome;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(isPalindrome(121), true);
        assertEquals(isPalindrome(-121), false);
        assertEquals(isPalindrome(10), false);
    }
}
