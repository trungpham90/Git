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
public class ReorderList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public void reorderList(ListNode head) {
            if (head == null) {
                return;
            }
            int n = 0;
            ListNode tmp = head;
            while (tmp != null) {
                n++;
                tmp = tmp.next;
            }
            tmp = head;
            for (int i = 0; i < (n - 1) / 2; i++) {
                tmp = tmp.next;
            }
            //  System.out.println(tmp.val);
            ListNode other = tmp.next;
            tmp.next = null;
            ListNode last = null, cur = other;
            while (cur != null) {
                ListNode a = cur.next;
                cur.next = last;
                last = cur;
                cur = a;
            }
            // print(head);
            //  print(last);
            boolean first = true;
            tmp = head;
            for (int i = 0; i < n; i++) {
                if (first) {
                    ListNode a = tmp.next;
                    tmp.next = last;
                    tmp = a;
                } else {
                    ListNode a = last.next;
                    last.next = tmp;
                    last = a;
                }
                // System.out.println(tmp.val + " " + last.val);
                first = !first;
            }
        }

        void print(ListNode head) {
            ListNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }

    }
}
