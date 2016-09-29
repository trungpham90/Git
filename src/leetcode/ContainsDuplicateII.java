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
public class ContainsDuplicateII {

    public class Solution {

        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    if (i - map.get(nums[i]) <= k) {
                        return true;
                    }
                }
                map.put(nums[i], i);
                if (i >= k) {
                    if (map.get(nums[i - k]) == i - k) {
                        map.remove(nums[i - k]);
                    }
                }
            }
            return false;
        }
    }
}
