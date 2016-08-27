package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trung Pham
 */
public class FlattenBinaryTreeToLinkedList {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode last;

    public void flatten(TreeNode root) {
        cal(root);
    }

    public void cal(TreeNode node) {
        if (node == null) {
            return;
        }
        if (last != null) {
            last.right = node;
        }
        last = node;
        TreeNode right = node.right;
        TreeNode left = node.left;
        node.left = null;
        cal(left);
        cal(right);

    }
}
