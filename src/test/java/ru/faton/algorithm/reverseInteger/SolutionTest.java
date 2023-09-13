package ru.faton.algorithm.reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.reverseInteger.Solution.reverse;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(reverse(123), 321);
        assertEquals(reverse(-123), -321);
        assertEquals(reverse(120), 21);
    }
}
