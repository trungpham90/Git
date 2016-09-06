/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Trung Pham
 */
public class Triangle {

    public class Solution {

        public int minimumTotal(List<List<Integer>> tri) {
            int max = 0;
            for (List<Integer> list : tri) {
                max = Integer.max(max, list.size());
            }
            int[] dp = new int[max];
            Arrays.fill(dp, Integer.MAX_VALUE);
            int result = Integer.MAX_VALUE;
            int n = tri.size();
            for (int i = 0; i < tri.get(0).size(); i++) {

                dp[i] = tri.get(0).get(i);

            }
            for (int i = 1; i < n; i++) {
                //  System.out.println(Arrays.toString(dp));
                int[] nxt = new int[max];
                Arrays.fill(nxt, Integer.MAX_VALUE);
                for (int j = 0; j < tri.get(i).size(); j++) {
                    int v = tri.get(i).get(j);
                    if (dp[j] != Integer.MAX_VALUE) {
                        nxt[j] = Integer.min(dp[j] + v, nxt[j]);
                    }

                    if (j > 0 && dp[j - 1] != Integer.MAX_VALUE) {
                        nxt[j] = Integer.min(dp[j - 1] + v, nxt[j]);
                    }
                }
                dp = nxt;
            }
            for (int i : dp) {
                result = Integer.min(result, i);
            }
            return result;
        }
    }
}
