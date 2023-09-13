package ru.faton.algorithm.addTwoNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.faton.algorithm.addTwoNumbers.Solution.*;

public class SolutionTest {

    @Test
    void success_1_test() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = new ListNode(0);

        Assertions.assertEquals(execute(l1, l2), result);
    }

    @Test
    void success_2_test() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = new ListNode(7, new ListNode(0, new ListNode(8)));

        Assertions.assertEquals(execute(l1, l2), result);
    }

    @Test
    void success_3_test() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        Assertions.assertEquals(execute(l1, l2), result);
    }
}
