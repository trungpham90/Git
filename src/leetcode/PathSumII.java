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
public class PathSumII {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            int h = height(root);
            int[] data = new int[h];
            cal(0, 0, sum, data, root);
            return result;
        }

        public void cal(int index, int sum, int need, int[] data, TreeNode node) {
            if (node == null) {
                return;
            }

            sum += node.val;
            data[index] = node.val;

            //System.out.println(sum + " " + index);
            if (node.left == null && node.right == null) {
                if (sum == need) {
                    List<Integer> re = new ArrayList();
                    for (int i = 0; i <= index; i++) {
                        re.add(data[i]);
                    }

                    result.add(re);
                }
                return;
            }

            cal(index + 1, sum, need, data, node.left);
            cal(index + 1, sum, need, data, node.right);
        }

        public int height(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int result = 1 + Integer.max(height(node.left), height(node.right));
            return result;
        }
    }
}
