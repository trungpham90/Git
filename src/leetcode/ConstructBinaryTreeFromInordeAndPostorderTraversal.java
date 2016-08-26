/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Trung Pham
 */
public class ConstructBinaryTreeFromInordeAndPostorderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(0, postorder.length - 1, map, postorder);
    }

    public TreeNode buildTree(int start, int end, HashMap<Integer, Integer> map, int[] post) {
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(post[end]);
        int index = map.get(post[end]);

        int a = start, b = -1;
        for (int i = start; i < end; i++) {
            if (map.get(post[i]) < index) {
                b = i;
            } else {
                break;
            }
        }
        node.left = buildTree(a, b, map, post);
        a = (b == -1) ? start : b + 1;
        b = end - 1;
        node.right = buildTree(a, b, map, post);
        return node;

    }
}
