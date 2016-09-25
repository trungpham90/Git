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
public class JumpGameII {

    public class Solution {

        public int jump(int[] nums) {
            int n = nums.length;
            int[] s = new int[n];
            int[] dp = new int[n];
            int end = 0;
            s[end++] = n - 1;
            for (int i = n - 2; i >= 0; i--) {
                int max = Math.min(n - 1, i + nums[i]);
                int st = 0;
                int ed = end - 1;
                int re = i + 1;
                while (st <= ed) {
                    int mid = (st + ed) / 2;
                    if (s[mid] <= max) {
                        ed = mid - 1;
                        re = s[mid];
                    } else {
                        st = mid + 1;
                    }
                }
                //System.out.println(i + " " + re);
                dp[i] = 1 + dp[re];
                while (dp[s[end - 1]] >= dp[i]) {
                    end--;
                }
                s[end++] = i;
            }
            return dp[0];
        }
    }
}
