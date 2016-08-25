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
public class ValidateBinarySearchTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode node, TreeNode min, TreeNode max) {
        if (node == null) {
            return true;
        }
        if (min != null && max != null) {
            if (min.val < node.val && node.val < max.val) {
                boolean a = isValidBST(node.left, min, node);
                boolean b = isValidBST(node.right, node, max);
                return a && b;
            }
            return false;
        } else if (min != null) {
            if (min.val < node.val) {
                boolean a = isValidBST(node.left, min, node);
                boolean b = isValidBST(node.right, node, max);
                return a && b;
            }
            return false;
        } else if (max != null) {
            if (node.val < max.val) {
                boolean a = isValidBST(node.left, min, node);
                boolean b = isValidBST(node.right, node, max);
                return a && b;
            }
            return false;
        } else {
            boolean a = isValidBST(node.left, min, node);
            boolean b = isValidBST(node.right, node, max);
            return a && b;
        }
    }
}

