package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class ConvertBiNodeM17 {

    /**
     * 将一颗二叉搜索树转变为一个链表，这里使用 左，中 ，右 遍历。
     *
     * @param root 根节点
     * @return
     */
    public TreeNode convertBiNode(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode newHead = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.add(root);
                root = root.right;
            } else {
                root = stack.pop();
                TreeNode newRoot = root.left;
                root.left = null;
                root.right = newHead;
                newHead = root;
                root = newRoot;
            }
        }
        return newHead;

    }
}
