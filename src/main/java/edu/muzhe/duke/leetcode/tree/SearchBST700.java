package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class SearchBST700 {

    /**
     * 二叉树
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }

    }

}
