package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/2.
 */
public class MirrorTree27 {

    /**
     * 镜像树的实现
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode mirrorRoot = new TreeNode(root.val);
        mirrorRoot.left = mirrorTree(root.right);
        mirrorRoot.right = mirrorTree(root.left);

        return mirrorRoot;

    }


}
