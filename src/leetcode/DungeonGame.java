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
public class DungeonGame {

    public class Solution {

        boolean[][] check;
        int[][] dp;

        public int calculateMinimumHP(int[][] dungeon) {
            int n = dungeon.length;
            int m = dungeon[0].length;
            check = new boolean[n][m];
            dp = new int[n][m];
            int v = cal(0, 0, dungeon);
            if (v >= 0) {
                return 1;
            }
            return 1 + Math.abs(v);
        }

        public int cal(int x, int y, int[][] data) {
            if (x + 1 == data.length && y + 1 == data[0].length) {
                return data[x][y];
            }
            if (x >= data.length || y >= data[0].length) {
                return -100000000;
            }
            if (check[x][y]) {
                return dp[x][y];
            }
            check[x][y] = true;
            int result = Integer.max(cal(x + 1, y, data), cal(x, y + 1, data));
            if (result <= 0) {
                result = data[x][y] + result;
            } else {
                result = data[x][y];
            }
            return dp[x][y] = result;
        }
    }
}
