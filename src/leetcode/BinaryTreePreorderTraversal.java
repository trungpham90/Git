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
public class BinaryTreePreorderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> s = new Stack();
            s.add(root);
            while (!s.isEmpty()) {
                TreeNode node = s.pop();
                if (node == null) {
                    continue;
                }
                result.add(node.val);
                s.add(node.right);
                s.add(node.left);
            }
            return result;
        }
    }
}
