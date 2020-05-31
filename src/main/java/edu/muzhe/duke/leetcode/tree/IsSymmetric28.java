package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class IsSymmetric28 {

    /**
     * 是否是镜像的节点
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {


        return isMirro(root, root);
    }

    /**
     * 是否镜像节点
     *
     * @param root1
     * @param root2
     * @return
     */
    private boolean isMirro(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            //两个节点不为null
            return root1.val == root2.val &&
                    isMirro(root1.left, root2.right) &&
                    isMirro(root1.right, root2.left);
        }
        return false;
    }
}
