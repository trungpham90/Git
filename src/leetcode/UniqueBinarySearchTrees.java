/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author Trung Pham
 */
public class UniqueBinarySearchTrees {

    public class Solution {

        int[] dp;

        public int numTrees(int n) {
            dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return cal(n);
        }

        public int cal(int n) {
            if (n == 0) {
                return 1;
            }
            if (n == 1) {
                return 1;
            }
            if (dp[n] != -1) {
                return dp[n];
            }
            int left = n - 1;
            int result = 0;
            for (int i = 0; i <= left; i++) {
                result += cal(i) * cal(left - i);
            }
            return dp[n] = result;
        }
    }
}
