package ru.faton.algorithm.reverseInteger;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class Solution {

    public static int execute(int x) {
        try {
            StringBuilder res = new StringBuilder();

            String str = String.valueOf(x);

            int i = str.length();
            while (i > 0) {
                char symbol = str.charAt(--i);
                if (i == 0 && !Character.isDigit(symbol)) {
                    res.insert(i, symbol);

                } else {
                    res.append(symbol);
                }
            }

            return Integer.parseInt(res.toString());

        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
