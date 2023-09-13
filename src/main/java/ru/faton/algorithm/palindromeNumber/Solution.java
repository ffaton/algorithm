package ru.faton.algorithm.palindromeNumber;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class Solution {

    public static boolean execute(int x) {
        char[] str = String.valueOf(x).toCharArray();
        int length = str.length;

        int i = 0;
        while (i < length / 2) {
            if (str[i++] != str[length - i]) {
                return false;
            }
        }

        return true;
    }
}
