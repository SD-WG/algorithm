package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class MinDepth111 {

    /**
     * 二叉树最小深度
     * 给定一个二叉树，找出最小深度
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);

        //这里如果有一个节点为空，这里需要被忽略掉的
        if (root.left == null || root.right == null) {
            return 1 + leftMinDepth + rightMinDepth;
        } else {
            return Math.min(leftMinDepth, rightMinDepth) + 1;
        }

    }

}
