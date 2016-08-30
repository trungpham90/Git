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
public class SortList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode sortList(ListNode head) {
            int count = 0;
            ListNode cur = head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return sort(head, count);

        }

        public ListNode sort(ListNode head, int l) {
            if (l <= 1) {
                return head;
            }
            int x = l / 2;
            int y = l - x;
            ListNode other = head;
            for (int i = 0; i < x - 1; i++) {

                other = other.next;

            }

            ListNode nxt = other.next;
            other.next = null;
            ListNode a = sort(head, x);
            ListNode b = sort(nxt, y);
            // System.out.println(a.val + " " + b.val + " " + x + " " + y);
            int c = 0, d = 0;
            ListNode result = null, cur = null;
            while (c < x && d < y) {
                if (a.val <= b.val) {
                    if (result == null) {
                        result = a;
                        cur = a;
                    } else {
                        cur.next = a;
                        cur = cur.next;
                    }
                    a = a.next;

                    c++;
                } else {
                    if (result == null) {
                        result = b;
                        cur = b;
                    } else {
                        cur.next = b;
                        cur = cur.next;
                    }
                    b = b.next;
                    d++;
                }

            }
            if (c < x) {
                cur.next = a;
            }
            if (d < y) {
                cur.next = b;
            }
            return result;
        }
    }
}
