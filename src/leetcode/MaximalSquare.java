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
public class MaximalSquare {

    static public class Solution {

        public int maximalSquare(char[][] matrix) {
            int n = matrix.length;
            if (n == 0) {
                return 0;
            }
            int m = matrix[0].length;
            int[][] cur = new int[2][m];
            int index = 0, result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == '1') {
                        if (i == 0 || j == 0) {
                            cur[index][j] = 1;
                        } else {
                            cur[index][j] = 1 + Integer.min(Integer.min(cur[1 - index][j], cur[1 - index][j - 1]), cur[index][j - 1]);
                        }
                    } else {
                        cur[index][j] = 0;
                    }
                    result = Integer.max(result, cur[index][j]);
                }
                index = 1 - index;
            }

            return result * result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        char[][] c = new char[4][3];
        for (int i = 0; i < 4; i++) {
            c[i] = "000".toCharArray();
        }
        System.out.println(s.maximalSquare(c));
    }
}
