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
public class KthSmallestElementInABST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public int kthSmallest(TreeNode root, int k) {
            int v = count(root.left) + 1;
            if (v == k) {
                return root.val;
            } else if (v > k) {
                return kthSmallest(root.left, k);
            } else {
                return kthSmallest(root.right, k - v);
            }
        }

        public int count(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int result = 1 + count(node.left) + count(node.right);
            return result;
        }
    }
}
