package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class SumOfLeftLeaves404 {

    /**
     * 返回所有左叶之和
     * 在遍历的过程中，如何判断是叶子节点，
     * 且为左叶子节点
     * //左中右
     */

    public int sumOfLeftLeaves(TreeNode root) {
        //这里可以传递一个参数进行，如果这里是左子树，且左右孩子都为空，就返回
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeftNode) {

        if (root == null) {
            return 0;
        }
        if (isLeftNode && root.left == null && root.right == null) {
            return root.val;
        }
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);

    }

}
