
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trung Pham
 */
public class LargestNumber {

    public class Solution {

        public String largestNumber(int[] nums) {
            Integer[] data = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                data[i] = nums[i];
            }
            Arrays.sort(data, (a, b) -> {
                String x = a + "" + b;
                String y = b + "" + a;
                return x.compareTo(y);

            });
            StringBuilder builder = new StringBuilder();
            for (int i = data.length - 1; i >= 0; i--) {
                if (data[i] == 0 && builder.length() == 0) {
                    continue;
                }
                builder.append(data[i]);
            }
            if (builder.length() == 0) {
                builder.append(0);
            }
            return builder.toString();
        }
    }
}
