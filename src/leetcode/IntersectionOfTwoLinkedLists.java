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
public class IntersectionOfTwoLinkedLists {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int n = count(headA);
            int m = count(headB);
            while (n > m) {
                n--;
                headA = headA.next;
            }
            while (m > n) {
                m--;
                headB = headB.next;
            }
            while (headA != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;

            }
            return null;
        }

        public int count(ListNode head) {
            int n = 0;
            ListNode cur = head;
            while (cur != null) {
                n++;
                cur = cur.next;
            }
            return n;
        }
    }
}
