/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashSet;

/**
 *
 * @author Trung Pham
 */
public class LongestConsecutiveSequence {

    public class Solution {

        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet();
            for (int i : nums) {
                set.add(i);
            }
            int result = 0;
            HashSet<Integer> remove = new HashSet();
            for (int i : nums) {
                if (!remove.contains(i)) {
                    int v = 1;
                    remove.add(i);
                    int left = i - 1;
                    while (set.contains(left)) {
                        remove.add(left);
                        left--;
                        v++;
                    }
                    left = i + 1;
                    while (set.contains(left)) {
                        remove.add(left);
                        left++;
                        v++;
                    }
                    result = Integer.max(result, v);
                }
            }
            return result;
        }
    }
}
