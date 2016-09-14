/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trung Pham
 */
public class CombinationSum {

    public class Solution {

        List<List<Integer>> result;

        public List<List<Integer>> combinationSum(int[] data, int target) {
            result = new ArrayList();
            cal(0, target, new ArrayList(), data);
            return result;
        }

        public void cal(int index, int left, List<Integer> list, int[] data) {
            if (left == 0) {
                result.add(list);
            }
            for (int i = index; i < data.length; i++) {
                if (data[i] <= left) {
                    List<Integer> tmp = new ArrayList(list);
                    tmp.add(data[i]);
                    cal(i, left - data[i], tmp, data);
                }
            }
        }
    }
}
