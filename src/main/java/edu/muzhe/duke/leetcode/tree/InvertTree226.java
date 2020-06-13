package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class InvertTree226 {

    /**
     * 翻转二叉树
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = invertTree(root.right);
        newRoot.right = invertTree(root.left);
        return newRoot;

    }

}
