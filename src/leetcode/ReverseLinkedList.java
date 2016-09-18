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
public class ReverseLinkedList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode last = null;
            while (cur != null) {
                ListNode tmp = cur.next;
                cur.next = last;
                last = cur;
                cur = tmp;
            }
            return last;
        }
    }
}
