/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Trung Pham
 */
public class MinimumSizeSubarraySum {

    public class Solution {

        public int minSubArrayLen(int s, int[] nums) {
            int start = 0;
            int result = 0;
            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
                while (total - nums[start] >= s) {
                    total -= nums[start];
                    start++;
                }
                if (total >= s) {
                    if (result == 0 || result > i - start + 1) {
                        result = i - start + 1;
                    }
                }
            }
            return result;
        }
    }
}
