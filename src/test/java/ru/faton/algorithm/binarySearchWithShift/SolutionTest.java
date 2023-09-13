package ru.faton.algorithm.binarySearchWithShift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.binarySearchWithShift.Solution.*;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(execute(new int[] {5, 6, 1, 2, 3, 4}, 2), 3);
        assertEquals(execute(new int[] {5, 6, 1, 2, 3, 4}, 10), -1);
        assertEquals(execute(new int[] {1, 2, 3, 4, 5, 6}, 10), -1);
    }
}
