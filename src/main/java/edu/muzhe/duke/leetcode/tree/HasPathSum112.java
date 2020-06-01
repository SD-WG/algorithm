package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/1.
 */
public class HasPathSum112 {

    /**
     * 路径总和
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }

        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            return true;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

    }

}
