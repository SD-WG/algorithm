package edu.muzhe.duke.leetcode.qq50;

import edu.muzhe.duke.leetcode.base.ListNode;

/**
 * @author muzhe-wang on 2020/5/15.
 */
public class HasCycle141 {

    /**
     * 链表中是否有环
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        //使用 一个双步和单步指针 向前前进
        //如果双步指针能够到达终点就表示没有换。
        //如果双步指针能够追上单步指针，就返回 true

        ListNode oneStepNode = head;
        if (head == null || head.next == null) {
            return false;
        }
        ListNode twoStepNode = head.next;

        while (twoStepNode != oneStepNode) {

            if (twoStepNode.next == null || twoStepNode.next.next == null) {
                return false;
            }

            twoStepNode = twoStepNode.next.next;
            oneStepNode = oneStepNode.next;

        }

        return true;

    }
}
