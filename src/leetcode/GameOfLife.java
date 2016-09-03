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
public class GameOfLife {

   static public class Solution {

        public void gamefLife(int[][] board) {
            int[] X = {0, 1, 0, -1, 1, 1, -1, -1};
            int[] Y = {1, 0, -1, 0, 1, -1, 1, -1};
            int n = board.length;
            int m = board[0].length;
            boolean[][] nxt = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int c = 0;
                    for (int k = 0; k < 8; k++) {
                        int a = i + X[k];
                        int b = j + Y[k];
                        if (a >= 0 && b >= 0 && a < n && b < m && board[a][b] == 1) {
                            c++;
                        }
                    }
                    if (c == 3 || (c >= 2 && board[i][j] == 1)) {
                        nxt[i][j] = true;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (nxt[i][j]) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        int[][]data = {{0, 1}, {1, 0}};
        Solution test = new Solution();
        test.gamefLife(data);
        
    }
   
}
