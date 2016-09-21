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
public class ValidSudoku {

    public class Solution {

        public boolean isValidSudoku(char[][] board) {
            for (int i = 0; i < 9; i++) {
                int mask1 = 0, mask2 = 0;
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int index = board[i][j] - '1';
                        if (((1 << index) & mask1) != 0) {
                            return false;
                        }
                        mask1 |= (1 << index);
                    }
                    if (board[j][i] != '.') {
                        int index = board[j][i] - '1';
                        if (((1 << index) & mask2) != 0) {
                            return false;
                        }
                        mask2 |= (1 << index);
                    }
                }
            }
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int mask = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int h = 0; h < 3; h++) {
                            if (board[i + k][j + h] != '.') {
                                int index = board[i + k][j + h] - '1';
                                if (((1 << index) & mask) != 0) {
                                    return false;
                                }
                                mask |= (1 << index);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
