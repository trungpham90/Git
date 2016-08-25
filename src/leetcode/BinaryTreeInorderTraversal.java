/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Trung Pham
 */

public class BinaryTreeInorderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> s = new Stack<>();

        s.push(root);
        while (!s.isEmpty()) {
            TreeNode node = s.pop();

            if (node == null) {
                continue;
            }
            if (node.left == null) {
                result.add(node.val);

                s.push(node.right);
            } else {

                s.push(node);
                s.push(node.left);
                node.left = null;

            }
        }
        return result;
    }
}
