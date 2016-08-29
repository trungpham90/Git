/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Trung Pham
 */
public class LowestCommonAncestorOfABinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        HashSet<TreeNode> a, b;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p == q) {
                return p;
            }
            HashMap<TreeNode, TreeNode> pa = new HashMap();
            LinkedList<TreeNode> tmp = new LinkedList();
            tmp.add(root);
            while (!tmp.isEmpty()) {
                TreeNode cur = tmp.poll();
                if (cur.left != null) {
                    pa.put(cur.left, cur);
                    tmp.add(cur.left);
                }
                if (cur.right != null) {
                    pa.put(cur.right, cur);
                    tmp.add(cur.right);
                }
            }
            a = new HashSet();
            a.add(root);
            TreeNode node = p;
            while (pa.containsKey(node)) {
                a.add(node);
                node = pa.get(node);
                if (node == q) {
                    return node;
                }
            }

            node = q;
            while (pa.containsKey(node)) {
                node = pa.get(node);
                if (a.contains(node)) {
                    return node;
                }
            }

            return root;
        }

    }
}
