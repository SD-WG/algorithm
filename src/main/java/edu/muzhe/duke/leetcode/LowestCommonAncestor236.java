package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/16.
 */
public class LowestCommonAncestor236 {

    /**
     * 早出最小公共子节点：
     * 如果当前节点为null,说明root和q的公共子节点不在当前子节点中
     * <p>
     * 去root中找p,或者q,如果root== p 或者root == q 表示 这个就是最小公共子节点。
     * 否者就分别取以 root的左右孩子为根节点，去寻找，返回对应的最小祖父节点：
     * 如果 如果任意一个为null,对应不为空的哪一个。
     * 如果两个都不为空，就说明root是最小公共祖先节点。然后返回。
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return root;
        } else if (root == p || root == q) {
            return root;
        }

        TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);

        if (leftAncestor == null) {
            return rightAncestor;
        } else if (rightAncestor == null) {
            return leftAncestor;
        } else {
            return root;
        }


    }
}
