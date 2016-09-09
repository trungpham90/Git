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
public class PartitionList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode partition(ListNode head, int x) {
            ListNode a = null, b = null;
            ListNode cur = head;
            ListNode other = null;
            while (cur != null) {
                if (cur.val < x) {
                    if (a == null) {

                        a = cur;
                        head = a;
                    } else {
                        a.next = cur;
                        a = a.next;
                    }
                } else if (b == null) {
                    b = cur;
                    other = b;
                } else {
                    b.next = cur;
                    b = b.next;
                }
                cur = cur.next;
            }
            if (b != null) {
                b.next = null;
            }
            if (a != null) {
                a.next = other;
                return head;
            }
            return other;

        }
    }
}
