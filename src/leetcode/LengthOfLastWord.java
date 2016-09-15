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
public class LengthOfLastWord {

    public class Solution {

        public int lengthOfLastWord(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
            String[] tmp = s.split("[ ]+");
            int result = 0;
            for (String w : tmp) {
                if (w.length() > 0) {
                    result = w.length();
                }
            }
            return result;
        }
    }
}
