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
public class InsertionSortList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode insertionSortList(ListNode head) {
            int n = 0;
            ListNode last = null;
            while (last != head) {
                ListNode tmp = head;
                ListNode cur = null;
                while (tmp != last) {
                    ListNode nxt = tmp.next;
                    if (nxt != null && nxt.val < tmp.val) {
                        int a = tmp.val;
                        tmp.val = nxt.val;
                        nxt.val = a;
                    }
                    cur = tmp;
                    tmp = tmp.next;
                }
                last = cur;
            }
            return head;
        }
    }
}
