package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class MaxDepth104 {

    /**
     * 找出最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Stack<ExTreeNode> stack = new Stack<ExTreeNode>();
        ExTreeNode node = new ExTreeNode(root, 1);

        int maxDepth = 0;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                if (node.isLeafNode()) {
                    if (node.depth > maxDepth) {
                        maxDepth = node.depth;
                    }
                }
                stack.push(node);
                if (node.node.left != null) {
                    node = new ExTreeNode(node.node.left, node.depth + 1);
                } else {
                    node = null;
                }
            } else {

                node = stack.pop();
                if (node.node.right != null) {
                    node = new ExTreeNode(node.node.right, node.depth + 1);
                } else {
                    node = null;
                }

            }
        }

        return maxDepth;

    }

    /**
     * 额外的树的节点
     */
    private class ExTreeNode {

        /**
         * 树的节点
         */
        TreeNode node;

        /**
         * 深度
         */
        int depth;

        /**
         * 额外的节点
         *
         * @param node
         * @param depth
         */
        public ExTreeNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }

        /**
         * 是否叶子节点
         *
         * @return
         */
        public boolean isLeafNode() {
            return node.left == null && node.right == null;
        }

    }

}
