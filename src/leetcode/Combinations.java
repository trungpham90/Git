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
public class Combinations {

    public class Solution {

        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            cal(0, n, k, new int[k], result);
            return result;
        }

        public void cal(int index, int n, int k, int[] data, List<List<Integer>> result) {
            if (index == k) {
                List<Integer> list = new ArrayList();
                for (int i = 0; i < k; i++) {
                    list.add(data[i]);
                }
                result.add(list);
                return;
            }
            for (int i = (index > 0 ? data[index - 1] + 1 : 1); i <= n; i++) {
                data[index] = i;
                cal(index + 1, n, k, data, result);
            }

        }
    }
}
