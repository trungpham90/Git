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
public class Subsets {
    public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        for(int i = 0 ; i < (1 << nums.length); i ++){
            List<Integer> list = new ArrayList();
            for(int j = 0 ; j < nums.length; j++){
                if(((1 << j) & i) != 0){
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }
        return result;
    }
}
}
