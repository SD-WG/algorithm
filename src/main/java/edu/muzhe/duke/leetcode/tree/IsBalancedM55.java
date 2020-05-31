package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class IsBalancedM55 {

    /**
     * 是否是平衡二叉树
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {

        /**
         *  判断一颗二叉树是否是平衡二叉树
         */
        if (root == null) {
            return true;
        }

        int leftHigh = countHeigh(root.left);
        int rightHigh = countHeigh(root.right);
        return (Math.abs(leftHigh - rightHigh) <= 1)
                && isBalanced(root.left)
                && isBalanced(root.right);

    }

    /**
     * 计算高度
     */
    private int countHeigh(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(countHeigh(root.left), countHeigh(root.right)) + 1;
    }

}
