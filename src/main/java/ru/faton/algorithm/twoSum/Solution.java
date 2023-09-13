package ru.faton.algorithm.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int checked = target - nums[i];

            if (map.containsKey(checked)) {
                return new int[]{map.get(checked), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
