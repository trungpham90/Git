/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trung Pham
 */
public class SetMatrixZeroes {

    public class Solution {

        public void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            boolean firstRowZeroes = false;
            boolean firstColZeroes = false;
            for (int i = 0; i < n; i++) {
                if (matrix[i][0] == 0) {
                    firstColZeroes = true;
                }
            }
            for (int i = 0; i < m; i++) {
                if (matrix[0][i] == 0) {
                    firstRowZeroes = true;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (firstColZeroes) {
                for (int i = 0; i < n; i++) {
                    matrix[i][0] = 0;
                }
            }
            if (firstRowZeroes) {
                for (int i = 0; i < m; i++) {
                    matrix[0][i] = 0;
                }
            }
        }
    }
}
