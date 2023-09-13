package ru.faton.algorithm.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> substr = new HashSet<>();

        int result = 0;
        int i = 0;
        int j = 0;
        while (i < length && j < length) {
            if (!substr.contains(s.charAt(j))) {
                substr.add(s.charAt(j++));
                result = Math.max(result, j - i);

            } else {
                substr.remove(s.charAt(i++));
            }
        }

        return result;
    }
}
