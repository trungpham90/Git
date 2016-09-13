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
public class RussianDollEnvelopes {
    public class Solution {
    
    public int maxEnvelopes(int[][] en) {
        Arrays.sort(en , (a, b) -> Integer.compare(a[0], b[0]));
        int n =  en.length;
        int[]dp = new int[n];
        int max = 0;
        for(int i = n - 1; i >= 0; i--){
            dp[i] = 1;
            for(int j = i + 1; j < n; j++){
                if(en[j][0] > en[i][0] && en[j][1] > en[i][1]){
                    dp[i] = Integer.max(dp[i], 1 + dp[j]);
                }
            }
            max = Integer.max(max, dp[i]);
        }    
        return max;
        
    }
    
    
}
}
