package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.base.ListNode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class GetIntersectionNode160 {

    /**
     * 获取到相交的节点
     *
     * @param headA 首队列节点
     * @param headB 队列B
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int aCount = calListNodeLength(headA);
        int bCount = calListNodeLength(headB);

        ListNode longerList, shorterList;
        int diffCount;
        if (aCount > bCount) {
            longerList = headA;
            shorterList = headB;
            diffCount = aCount - bCount;
        } else {
            longerList = headB;
            shorterList = headA;
            diffCount = bCount - aCount;
        }

        while (diffCount > 0) {
            longerList = longerList.next;
            diffCount--;
        }

        while (longerList != null) {
            if (longerList == shorterList) {
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }

        return null;
    }

    /**
     * 计算 head链表的长度
     *
     * @param head
     * @return
     */
    private int calListNodeLength(ListNode head) {

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;

    }
}
