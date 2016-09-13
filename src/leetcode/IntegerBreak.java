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
public class IntegerBreak {

    public class Solution {

        public int integerBreak(int n) {
            int max = 0;
            for (int i = 2; i <= n; i++) {
                int v = n / i;
                int o = n % i;
                int re = 1;
                for (int j = 0; j < i; j++) {
                    if (j < o) {
                        re *= (v + 1);
                    } else {
                        re *= v;
                    }
                }
                max = Integer.max(max, re);
            }
            return max;
        }
    }
}
