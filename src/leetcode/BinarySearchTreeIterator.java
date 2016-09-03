/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 *
 * @author Trung Pham
 */
public class BinarySearchTreeIterator {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class BSTIterator {

        boolean hasPa = false;
        Stack<TreeNode> q = new Stack();

        public BSTIterator(TreeNode root) {
            TreeNode cur = root;
            while (cur != null) {
                q.add(cur);
                cur = cur.left;
            }
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {

            return !q.isEmpty();
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode tmp = q.pop();
            if (tmp.right != null) {
                TreeNode cur = tmp.right;
                while (cur != null) {
                    q.add(cur);
                    cur = cur.left;
                }
            }
            return tmp.val;
        }
    }

    /**
     * Your BSTIterator will be called like this: BSTIterator i = new
     * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
     */
}
