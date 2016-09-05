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
public class RotateList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) {
                return head;
            }
            int n = 0;
            ListNode cur = head;
            while (cur != null) {
                n++;
                cur = cur.next;
            }

            k %= n;
            if (n == 1 || k == 0) {
                return head;
            }
            int first = n - k;
            cur = head;
            for (int i = 0; i < first - 1; i++) {
                cur = cur.next;
            }

            ListNode tmp = cur.next;
            cur.next = null;
            cur = head;
            head = tmp;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = cur;
            return head;
        }
    }
}
