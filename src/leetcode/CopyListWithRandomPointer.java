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
public class CopyListWithRandomPointer {

    class RandomListNode {

        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    };

    public class Solution {

        public RandomListNode copyRandomList(RandomListNode head) {
            RandomListNode cur = head;
            RandomListNode result = null;
            RandomListNode last = null;
            HashMap<RandomListNode, RandomListNode> map = new HashMap();
            while (cur != null) {
                RandomListNode tmp = new RandomListNode(cur.label);
                if (result == null) {
                    result = tmp;
                }
                if (last != null) {
                    last.next = tmp;
                }
                tmp.random = cur;
                tmp.next = null;
                map.put(cur, tmp);
                cur = cur.next;
                last = tmp;
            }
            cur = result;
            while (cur != null) {
                RandomListNode org = cur.random;
                if (org.random != null) {
                    cur.random = map.get(org.random);
                } else {
                    cur.random = null;
                }
                cur = cur.next;
            }
            return result;
        }
    }
}
