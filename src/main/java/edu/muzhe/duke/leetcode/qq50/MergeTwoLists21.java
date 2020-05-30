package edu.muzhe.duke.leetcode.qq50;

import edu.muzhe.duke.leetcode.base.ListNode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class MergeTwoLists21 {


    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode(-1);
        ListNode p = newHead;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = l2;
                break;

            } else if (l2 == null) {
                p.next = l1;
                break;
            } else if (l1.val < l2.val) {
                ListNode nextNode = l1.next;
                p.next = l1;
                p = p.next;
                l1 = nextNode;
            } else {
                //l2.val >= l1.val
                ListNode nextNode = l2.next;
                p.next = l2;
                p = p.next;
                l2 = nextNode;
            }
        }
        return newHead.next;

    }
}
