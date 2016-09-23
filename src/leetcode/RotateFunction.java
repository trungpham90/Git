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
public class RotateFunction {
    public class Solution {
    public int maxRotateFunction(int[] A) {
        int n = A.length;
        int[]left = new int[n];
        int[]right = new int[n];
        
        int start = 0;
        for(int i = 0; i < n; i++){
            left[i] = A[i];
            if(i > 0){
                left[i] += left[i - 1];
            }
            start += i*A[i];
        }
        for(int i = n - 1; i >= 0; i--){
            right[i] = A[i];
            if(i + 1 < n){
                right[i] += right[i + 1];
            }
        }
        int result = start;
        for(int i = 1; i < n; i++){
            start -= right[i];
            if(i > 1){
                start -= left[i - 2];
            }
            start += (n - 1)*A[i - 1];
            result = Integer.max(result, start);
        }
        return result;
        
    }
}
}
