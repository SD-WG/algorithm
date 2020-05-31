package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class SumOfLeftLeaves404 {

    /**
     * 返回所有左叶之和
     * 在遍历的过程中，如何判断是叶子节点，
     * 且为左叶子节点
     * 如何标记做子树
     * //左中右
     */

    public int sumOfLeftLeaves(TreeNode root) {
        //这里可以传递一个参数进行，如果这里是左子树，且左右孩子都为空，就返回

        if (root == null) {
            return 0;
        }

        //用先序遍历
        int sum = 0;
        Stack<Pair> stack = new Stack<Pair>();
        Pair pair = new Pair(root, false);
        while (!stack.isEmpty() || pair != null) {
            if (pair != null) {
                stack.push(pair);
                if (pair.node.left != null) {
                    pair = new Pair(pair.node.left, true);
                } else {
                    pair = null;
                }
            } else {

                pair = stack.pop();
                if (pair.isLeftNode && pair.node.left == null && pair.node.right == null) {
                    sum += pair.node.val;
                }
                if (pair.node.right != null) {
                    pair = new Pair(pair.node.right, false);
                } else {
                    pair = null;
                }
            }
        }
        return sum;

    }

    /**
     * 节点的node
     */
    private class Pair {

        TreeNode node;

        boolean isLeftNode;

        public Pair(TreeNode node, boolean isLeftNode) {
            this.node = node;
            this.isLeftNode = isLeftNode;
        }

    }


}
