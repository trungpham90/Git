/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Trung Pham
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Deque<TreeNode> q = new LinkedList();
            q.add(root);
            boolean left2Right = true;
            List<List<Integer>> result = new ArrayList();
            while (!q.isEmpty()) {
                List<Integer> list = new ArrayList();
                Deque<TreeNode> nxt = new LinkedList();
                while (!q.isEmpty()) {
                    TreeNode node = q.pollFirst();
                    if (node == null) {
                        continue;
                    }
                    list.add(node.val);
                    if (left2Right) {
                        nxt.addFirst(node.left);
                        nxt.addFirst(node.right);
                    } else {
                        nxt.addFirst(node.right);
                        nxt.addFirst(node.left);
                    }
                }
                q = nxt;
                if (!list.isEmpty()) {
                    result.add(list);
                }
                left2Right = !left2Right;
            }
            return result;
        }
    }
}
