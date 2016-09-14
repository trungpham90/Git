/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.*;

/**
 *
 * @author Trung Pham
 */
public class CombinationSumIII {

    public class Solution {

        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList();
            for (int i = 1; i < (1 << 9); i++) {
                if (Integer.bitCount(i) != k) {
                    continue;
                }
                int total = 0;
                for (int j = 0; j < 9; j++) {
                    if (((1 << j) & i) != 0) {
                        total += (j + 1);
                    }
                }
                if (total == n) {
                    List<Integer> list = new ArrayList();
                    for (int j = 0; j < 9; j++) {
                        if (((1 << j) & i) != 0) {
                            list.add((j + 1));
                        }
                    }
                    result.add(list);
                }
            }
            return result;
        }
    }
}
