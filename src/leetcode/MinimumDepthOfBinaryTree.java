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
public class MinimumDepthOfBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public int minDepth(TreeNode root) {
            return cal(root);
        }

        public int cal(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int result = -1;
            if (node.left != null) {
                result = 1 + cal(node.left);
            }
            if (node.right != null) {
                int v = 1 + cal(node.right);
                if (result == -1 || result > v) {
                    result = v;
                }
            }
            if (result == -1) {
                result = 1;
            }
            return result;
        }
    }
}
