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
public class OddEvenLinkedList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode oddEvenList(ListNode head) {
            int start = 0;
            ListNode odd = null, oddHead = null;
            ListNode even = null, evenHead = null;
            while (head != null) {
                if (start % 2 == 0) {
                    if (oddHead == null) {
                        odd = head;
                        oddHead = odd;
                    } else {
                        odd.next = head;
                        odd = odd.next;
                    }
                } else if (even == null) {

                    even = head;
                    evenHead = even;
                } else {
                    even.next = head;
                    even = even.next;
                }
                head = head.next;

                start++;
            }
            if (start <= 1) {
                return oddHead;
            }
            odd.next = evenHead;
            even.next = null;

            return oddHead;
        }

    }
}
