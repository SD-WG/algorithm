package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/13.
 */
public class MinStack {

    private Node head = new Node(-1, null, -1);

    public MinStack() {

    }

    public void push(int x) {
        Node top = new Node(x, head.next, x);
        if (head.next != null) {
            if (head.next.minValue < top.minValue) {
                top.minValue = head.next.minValue;
            }
        }
        head.next = top;

    }

    public void pop() {

        if (head.next == null) {
            throw new RuntimeException("");
        }
        head.next = head.next.next;

    }

    public int top() {
        return head.next.value;
    }

    public int getMin() {
        return head.next.minValue;
    }

}

class Node {

    /**
     * 数值
     */
    int value;

    /**
     *
     */
    Node next;

    /**
     * 最小值
     */
    int minValue;

    /**
     * 节点
     *
     * @param value
     * @param next
     * @param minValue
     */
    public Node(int value, Node next, int minValue) {
        this.value = value;
        this.next = next;
        this.minValue = minValue;
    }

}
