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
public class IntegerReplacement {

    public class Solution {

        public int integerReplacement(int n) {

            return cal(n);
        }

        int cal(long n) {
            if (n == 1) {
                return 0;
            }

            if (n % 2 == 0) {
                return 1 + cal(n / 2);
            } else {
                return 2 + Integer.min(cal((n + 1) / 2), cal((n - 1) / 2));
            }
        }
    }
}
