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
public class TwoSumII {

    public class Solution {

        public int[] twoSum(int[] numbers, int target) {
            int i = 0;
            int j = numbers.length - 1;
            while (i < j && numbers[i] + numbers[j] != target) {
                if (numbers[i] + numbers[j] > target) {
                    j--;
                } else if (numbers[i] + numbers[j] < target) {
                    i++;
                }
            }
            return new int[]{i + 1, j + 1};
        }
    }
}
