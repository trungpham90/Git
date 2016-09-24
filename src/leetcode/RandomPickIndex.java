/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.*;
/**
 *
 * @author Trung Pham
 */
public class RandomPickIndex {

    public class Solution {

        Map<Integer, List<Integer>> map = new HashMap<>();

        public Solution(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], new ArrayList());
                }
                map.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            int size = map.get(target).size();
            Random ran = new Random();
            int r = ran.nextInt(size);
            return map.get(target).get(r);
        }
    }

    /**
     * Your Solution object will be instantiated and called as such: Solution
     * obj = new Solution(nums); int param_1 = obj.pick(target);
     */
}
