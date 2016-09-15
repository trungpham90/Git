/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Trung Pham
 */
public class RemoveDuplicatesFromSortedArrayII {

    public class Solution {

        public int removeDuplicates(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                int v = nums[i];
                if (!map.containsKey(v)) {
                    map.put(v, 1);
                    nums[result++] = v;
                } else if (map.get(v) == 1) {
                    map.put(v, map.get(v) + 1);
                    nums[result++] = v;
                }
            }

            return result;
        }
    }
}
