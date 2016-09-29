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
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList();
            List<TreeNode> q = new LinkedList();
            q.add(root);
            while (!q.isEmpty()) {
                List<Integer> list = new ArrayList();
                List<TreeNode> nxt = new LinkedList();
                while (!q.isEmpty()) {
                    TreeNode node = q.remove(0);
                    if (node == null) {
                        continue;
                    }
                    list.add(node.val);
                    nxt.add(node.left);
                    nxt.add(node.right);
                }
                q = nxt;
                if (!list.isEmpty()) {
                    result.add(list);
                }
            }
            return result;
        }
    }
}
