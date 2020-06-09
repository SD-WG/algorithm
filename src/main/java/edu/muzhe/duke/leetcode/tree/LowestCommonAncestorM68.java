package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/10.
 */
public class LowestCommonAncestorM68 {

    /**
     * 找出 p,q最近公共祖先
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode leftRoot = lowestCommonAncestor(root.left, p, q);
        TreeNode rightRoot = lowestCommonAncestor(root.right, p, q);
        if (leftRoot != null && rightRoot != null) {
            return root;
        }
        if (leftRoot == null) {
            return rightRoot;
        } else {
            return leftRoot;
        }
    }

}
