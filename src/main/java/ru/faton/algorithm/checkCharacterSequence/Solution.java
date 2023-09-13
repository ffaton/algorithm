package ru.faton.algorithm.checkCharacterSequence;

/**
 * Вернуть true/false если искомая последовательность символов есть в исходной строке
 */
public class Solution {

    public static boolean execute(String x, String message) {
        int i = 0;
        int j = 0;

        while (i < x.length()) {
            while (j < message.length()) {
                if (x.charAt(i) == message.charAt(j)) {
                    j++;
                    if (i == x.length() - 1) {
                        return true;
                    }
                    break;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
