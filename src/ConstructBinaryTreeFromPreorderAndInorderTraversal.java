
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Trung Pham
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(0, map.size() - 1, map, preorder);
    }

    public TreeNode build(int start, int end, HashMap<Integer, Integer> map, int[] preorder) {
        if (start > end) {
            return null;
        }
        int index = map.get(preorder[start]);
        TreeNode result = new TreeNode(preorder[start]);
        int a = start + 1, b = -1;
        for (int i = start + 1; i <= end; i++) {
            if (map.get(preorder[i]) < index) {
                b = i;
            } else {
                break;
            }
        }
        result.left = build(a, b, map, preorder);
        a = (b == -1) ? start + 1 : b + 1;
        b = end;
        result.right = build(a, b, map, preorder);
        return result;
    }

}
