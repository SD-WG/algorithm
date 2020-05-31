package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class IsBalanced110 {

    /**
     * 是否是一棵平衡二叉树
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {

        return calBalanceInfo(root).isBalance;

    }


    /**
     * 将自底向上 移动的实现。
     * @param root
     * @return
     */
    private TreeInfo calBalanceInfo(TreeNode root) {

        if (root == null) {
            return new TreeInfo(-1, true);
        }

        //左子树的高度信息
        TreeInfo leftTreeInfo = calBalanceInfo(root.left);
        if (!leftTreeInfo.isBalance) {
            return leftTreeInfo;
        }

        //右子树的高度信息
        TreeInfo rightTreeInfo = calBalanceInfo(root.right);
        if (!rightTreeInfo.isBalance) {
            return rightTreeInfo;
        }

        return new TreeInfo(1 + Math.max(leftTreeInfo.height, rightTreeInfo.height),
                Math.abs(leftTreeInfo.height - rightTreeInfo.height) <= 1);

    }

    private class TreeInfo {

        int height;

        boolean isBalance;

        /**
         * 够着一个树的信息
         *
         * @param height
         * @param isBalance
         */
        public TreeInfo(int height, boolean isBalance) {
            this.height = height;
            this.isBalance = isBalance;
        }
    }

}
