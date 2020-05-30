package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class IsBalanced0404 {

    /**
     * 判断一棵树是否是平衡二叉树
     * 计算出左右两棵子树的高度，
     * 然后计算两个子树的高度差是否大于一
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {

        //从叶子节点开始，如果高度相差大于1，这个时候就返回
        if (root == null) {
            return true;
        }

        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }

    /**
     * 计算节点的高度
     *
     * @param root
     * @return
     */
    private int height(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }

    }
}
