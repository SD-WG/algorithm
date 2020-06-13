package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class IsUnivalTree965 {

    /**
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isUnivalTree(root, root.val);
    }

    /**
     * root是一棵val的单值的二叉树
     *
     * @param root
     * @param val
     * @return
     */
    private boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }


        return root.val == val &&
                isUnivalTree(root.left, val) &&
                isUnivalTree(root.right, val);
    }

}
