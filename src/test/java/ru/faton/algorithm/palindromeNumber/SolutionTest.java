package ru.faton.algorithm.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.palindromeNumber.Solution.execute;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(execute(121), true);
        assertEquals(execute(-121), false);
        assertEquals(execute(10), false);
    }
}
