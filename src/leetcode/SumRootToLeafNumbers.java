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
public class SumRootToLeafNumbers {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public int sumNumbers(TreeNode root) {
            return cal(root, 0);
        }

        public int cal(TreeNode node, int val) {
            if (node == null) {
                return val;
            }
            int nxt = val * 10 + node.val;
            if (node.left == null) {
                return cal(node.right, nxt);
            } else if (node.right == null) {
                return cal(node.left, nxt);
            }

            int result = cal(node.left, nxt) + cal(node.right, nxt);
            return result;
        }
    }
}
