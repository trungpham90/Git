/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trung Pham
 */
public class BinaryTreeRightSideView {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public List<Integer> rightSideView(TreeNode root) {

            List<Integer> result = new ArrayList<>();
            rightSide(root, 1, result);
            return result;
        }

        public void rightSide(TreeNode node, int level, List<Integer> list) {
            if (node == null) {
                return;
            }
            if (level > list.size()) {
                list.add(node.val);
            }

            rightSide(node.right, level + 1, list);
            rightSide(node.left, level + 1, list);

        }
    }
}
