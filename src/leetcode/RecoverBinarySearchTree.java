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
public class RecoverBinarySearchTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode high = null, low = null, last = null, lastLast = null;

    public void recoverTree(TreeNode root) {
        visit(root);
        if (last != null && lastLast != null) {
            if (lastLast.val > last.val) {
                low = last;
            }
        }
        int tmp = low.val;
        low.val = high.val;
        high.val = tmp;
    }

    public void visit(TreeNode node) {
        if (node == null) {
            return;
        }
        visit(node.left);

        if (last != null && lastLast != null) {
            //System.out.println(lastLast.val + " " + last.val + " " + node.val);
            if (last.val > node.val && last.val > lastLast.val && high == null) {
                high = last;
            } else if (last.val < node.val && last.val < lastLast.val) {
                low = last;
            }
        } else if (last != null) {
            // System.out.println(last.val + " " + node.val);
            if (last.val > node.val) {
                high = last;
            }
        }
        // System.out.println("TMP " + (high!= null ? high.val : null) + " " + (low != null ? low.val : low ));
        lastLast = last;
        last = node;
        visit(node.right);

    }
}
