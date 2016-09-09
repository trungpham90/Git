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
public class WorldLadderII {

    public class Solution {

        int[][] dp;

        public int maxProfit(int[] p) {
            int n = p.length;
            if (n == 0) {
                return 0;
            }
            dp = new int[n][2];
            for (int i = n - 1; i >= 0; i--) {
                dp[i][1] = Math.max(p[i] + (i + 2 < n ? dp[i + 2][0] : 0), i + 1 < n ? dp[i + 1][1] : 0);
                dp[i][0] = Math.max(-p[i] + (i + 1 < n ? dp[i + 1][1] : 0), i + 1 < n ? dp[i + 1][0] : 0);
            }
            return dp[0][0];
        }

    }
}
