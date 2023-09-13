package ru.faton.algorithm.reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.reverseInteger.Solution.execute;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(execute(123), 321);
        assertEquals(execute(-123), -321);
        assertEquals(execute(120), 21);
    }
}
