/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Trung Pham
 */
public class MinimumWindowSubstring {
    public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        int st = -1;
        int ed = -1;
        int index = 0;
        HashMap<Character, Integer> cur = new HashMap();
        int v = 0;
        
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(cur.containsKey(c)){
                cur.put(c, cur.get(c) + 1);
            }else{
                cur.put(c, 1);
            }
            
            if(map.containsKey(c) && cur.get(c).intValue() == map.get(c).intValue()){
               
                v++;
            }
            c = s.charAt(index);
            while(index <= i && (!map.containsKey(c) || map.get(c).intValue() < cur.get(c).intValue())){
                index++;
                cur.put(c, cur.get(c) - 1);
                if(index <= i){
                    c = s.charAt(index);
                }
            }
           
           
            if(v == map.size()){
                if(st == -1 || (ed - st) > (i - index) ){
                    st = index;
                    ed = i;
                }
                
            }
        }
        if(st == -1){
            return "";
        }
        String result = s.substring(st, ed + 1);
        return result;
    }
}
}
