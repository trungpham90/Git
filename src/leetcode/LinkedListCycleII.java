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
public class LinkedListCycleII {

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {

        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode one = head;
            ListNode two = head;
            do {
                if (two == null || one == null || two.next == null || two.next.next == null) {
                    return null;
                }
                one = one.next;
                two = two.next.next;

            } while (one != two);
            one = head;
            while (one != two) {
                one = one.next;
                two = two.next;
            }
            return one;
        }
    }
}
