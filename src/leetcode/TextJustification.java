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
public class TextJustification {

    public class Solution {

        public List<String> fullJustify(String[] words, int maxWidth) {
            int start = 0;
            List<String> result = new ArrayList();
            while (start < words.length) {
                int total = 0;
                int end = start;
                for (int i = start; i < words.length; i++) {
                    if (total + words[i].length() + (i - start) <= maxWidth) {
                        end = i;
                        total += words[i].length();
                    } else {
                        break;
                    }
                }
                StringBuilder builder = new StringBuilder();
                int num = end - start;
                if (end != start && end + 1 != words.length) {

                    int left = maxWidth - total - num;
                    int extra = left / num;
                    int other = left % num;

                    for (int i = start; i <= end; i++) {
                        if (i != start) {
                            builder.append(" ");
                            for (int j = 0; j < extra; j++) {
                                builder.append(" ");
                            }
                            if (i - start <= other) {
                                builder.append(" ");
                            }
                        }
                        builder.append(words[i]);
                    }

                } else if (end == start) {
                    builder.append(words[start]);
                    int left = maxWidth - total;
                    for (int i = 0; i < left; i++) {
                        builder.append(" ");
                    }
                } else {
                    int left = maxWidth - total - num;
                    for (int i = start; i <= end; i++) {
                        if (i != start) {
                            builder.append(" ");
                        }
                        builder.append(words[i]);
                    }
                    for (int i = 0; i < left; i++) {
                        builder.append(" ");
                    }
                }
                result.add(builder.toString());
                start = end + 1;
            }
            return result;
        }
    }
}
