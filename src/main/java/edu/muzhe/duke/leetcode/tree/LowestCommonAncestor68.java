package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class LowestCommonAncestor68 {

    /**
     * 二叉搜索树的最近公共祖先
     * 如果 一个节点 == p
     * <p>
     * []
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        TreeNode lowNode, highNode;
        if (p.val < q.val) {
            lowNode = p;
            highNode = q;
        } else {
            lowNode = q;
            highNode = p;
        }

        while (root != p && root != q && !(root.val < highNode.val && root.val > lowNode.val)) {

            if (root.val > highNode.val) {
                root = root.left;
            }
            if (root.val < lowNode.val) {
                root = root.right;
            }
        }

        return root;
    }

}
