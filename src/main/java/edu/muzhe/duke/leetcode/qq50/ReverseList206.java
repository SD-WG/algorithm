package edu.muzhe.duke.leetcode.qq50;

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

        ListNode newHead = null;
        return transNode(newHead, head);

    }

    /**
     * 将head中的所有的元素，使用头插法的方式插入到newHead的前面
     *
     * @param newHead
     * @param head
     */
    private ListNode transNode(ListNode newHead, ListNode head) {

        if (head == null) {
            return newHead;
        }

        ListNode headNext = head.next;
        head.next = newHead;
        newHead = head;

        return transNode(newHead, headNext);

    }
}
