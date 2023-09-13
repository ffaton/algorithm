package ru.faton.algorithm.addTwoNumbers;

import lombok.*;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class Solution {

    @NoArgsConstructor
    @AllArgsConstructor
    @RequiredArgsConstructor
    @EqualsAndHashCode
    static class ListNode {
        @EqualsAndHashCode.Include
        @NonNull
        Integer val;
        @EqualsAndHashCode.Include
        ListNode next;
    }

    public static ListNode execute(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode nextNode = null;
        int overRange = 0;

        boolean l1HaveNext = true;
        boolean l2HaveNext = true;

        while (l1HaveNext || l2HaveNext) {
            int temp = (l1HaveNext ? l1.val : 0) + (l2HaveNext ? l2.val : 0) + overRange;
            overRange = temp / 10;

            //criteria for next loop
            l1 = l1HaveNext ? l1.next : null;
            l2 = l2HaveNext ? l2.next : null;
            l1HaveNext = l1 != null;
            l2HaveNext = l2 != null;

            ListNode newNode = l1HaveNext || l2HaveNext ? new ListNode() : null;

            if (result == null) {
                result = new ListNode(temp % 10, newNode);
                nextNode = result;

            } else {
                nextNode.val = temp%10;
                nextNode.next = newNode;
            }

            if (overRange > 0 && !l1HaveNext && !l2HaveNext) {
                nextNode.next = new ListNode(overRange);
                break;
            }

            nextNode = newNode;
        }

        return result;
    }
}
