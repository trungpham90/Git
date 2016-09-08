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
public class RotateImage {

    public class Solution {

        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    int x = i;
                    int y = j;
                    int cur = matrix[i][j];
                    do {
                        int[] nxt = convert(x, y, n);
                        //  System.out.println(Arrays.toString(nxt) + " " + x + " " + y );
                        int tmp = matrix[nxt[0]][nxt[1]];
                        matrix[nxt[0]][nxt[1]] = cur;
                        cur = tmp;
                        x = nxt[0];
                        y = nxt[1];
                    } while (x != i || y != j);
                }
            }
        }

        public int[] convert(int x, int y, int n) {
            return new int[]{y, n - 1 - x};
        }
    }
}
