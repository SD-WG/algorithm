package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.base.ListNode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class ReverseList206 {

    /**
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode newHead = null;
        ListNode p = head;
        while (p != null) {
            ListNode pNext = p.next;
            p.next = newHead;
            newHead = p;
            p = pNext;
        }

        return newHead;
    }
}
