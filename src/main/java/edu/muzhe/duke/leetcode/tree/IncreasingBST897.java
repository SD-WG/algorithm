package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class IncreasingBST897 {

    /**
     * 将一个bst转变为一个数组
     * 进行中序遍历。其中左子树为空，右子树为下一个节点
     * 左，中，右
     * 右 ，中 ，左
     *
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode newRoot = null;
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
                TreeNode nextNode = root.left;
                root.right = newRoot;
                root.left = null;
                newRoot = root;
                root = nextNode;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return newRoot;

    }

}
