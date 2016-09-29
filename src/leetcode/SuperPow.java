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
public class SuperPow {
    public class Solution {
    int MOD = 1337 ;
    public int superPow(int a, int[] b) {
        a %= MOD;
        int result = 1;
        for(int i = 0; i < b.length; i++){
            result = (pow(result, 10)*pow(a, b[i])) % MOD;
        }
        return result;
    }
    public int pow(int a, int v){
        if(v == 0){
            return 1;
        }
        int tmp = pow(a, v / 2);
        if(v % 2 == 0){
            return (tmp * tmp) % MOD;
        }
        return ((tmp * tmp) % MOD * a) % MOD;
    }
}
}
