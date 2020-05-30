package edu.muzhe.duke.leetcode.tree;

import java.util.List;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class Node {

    /**
     * value值
     */
    public int val;

    /**
     * 孩子节点
     */
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

}
