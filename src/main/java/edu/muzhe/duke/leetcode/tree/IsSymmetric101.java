package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class IsSymmetric101 {


    /**
     * 对称二叉树
     * 这里的条件是：
     * 使用两棵树，
     * 然后用当前节点和对面节点进行比较、
     * 然后用左子树和对面的右子树进行比对，是否是镜像
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);
    }

    /**
     * @param root1
     * @param root2
     * @return
     */
    private boolean isMirror(TreeNode root1, TreeNode root2) {

        //两个同事为null返回true
        if (root1 == null && root2 == null) {
            return true;
        }
        //如果两个当中有一个为空，就返回true
        if (root1 == null || root2 == null) {
            return false;
        }

        //这个时候两个不同时为null,这个时候就需要进行判断
        if (root1.val != root2.val) {
            return false;
        }
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);


    }

}
