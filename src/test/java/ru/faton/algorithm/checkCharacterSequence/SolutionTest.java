package ru.faton.algorithm.checkCharacterSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.faton.algorithm.checkCharacterSequence.Solution.execute;

public class SolutionTest {

    @Test
    void success_test() {
        assertEquals(execute("crdle", "crocodile.txt"), true);
        assertEquals(execute("le", "crocodile.txt"), true);
        assertEquals(execute("coco", "crocodile.txt"), true);
        assertEquals(execute("crdleee", "crocodile.txt"), false);
        assertEquals(execute("crkdl", "crocodile.txt"), false);
    }
}
