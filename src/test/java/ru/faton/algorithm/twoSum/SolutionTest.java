package ru.faton.algorithm.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.faton.algorithm.twoSum.Solution.*;

public class SolutionTest {

    @Test
    void success_test() {
        assertArrayEquals(execute(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(execute(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(execute(new int[]{3, 3}, 6), new int[]{0, 1});
    }
}
