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
public class SortColors {

    public class Solution {

        public void sortColors(int[] nums) {
            int[] count = new int[3];
            for (int i : nums) {
                count[i]++;
            }
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < count[i]; j++) {
                    nums[index++] = i;
                }
            }
        }
    }
}
