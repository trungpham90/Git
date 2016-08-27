package leetcode;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * #
 * @author pttrung
 */
public class HouseRobberIII {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    HashMap<TreeNode, Integer> pos = new HashMap();
    HashMap<TreeNode, Integer> neg = new HashMap();

    public int rob(TreeNode root) {
        return rob(false, root);
    }

    public int rob(boolean pa, TreeNode node) {
        int result = 0;
        if (node == null) {
            return result;
        }
        if (pa && pos.containsKey(node)) {
            return pos.get(node);
        } else if (!pa && neg.containsKey(node)) {
            return neg.get(node);
        }
        if (!pa) {
            result = node.val + rob(true, node.left) + rob(true, node.right);
        }
        result = Integer.max(result, rob(false, node.left) + rob(false, node.right));
        if (pa) {
            pos.put(node, result);
        } else {
            neg.put(node, result);
        }
        return result;
    }

}
