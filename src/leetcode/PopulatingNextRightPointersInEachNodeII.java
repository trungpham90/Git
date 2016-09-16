/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;

/**
 *
 * @author Trung Pham
 */
public class PopulatingNextRightPointersInEachNodeII {

    public class TreeLinkNode {

        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public void connect(TreeLinkNode root) {
            LinkedList<TreeLinkNode> q = new LinkedList();
            q.add(root);

            while (!q.isEmpty()) {
                TreeLinkNode last = null;
                LinkedList<TreeLinkNode> nxt = new LinkedList();
                while (!q.isEmpty()) {
                    TreeLinkNode node = q.poll();
                    if (node == null) {
                        continue;
                    }
                    if (last != null) {
                        last.next = node;
                    }
                    last = node;
                    nxt.add(node.left);
                    nxt.add(node.right);
                }
                if (last != null) {
                    last.next = null;
                }
                q = nxt;
            }
        }
    }
}
