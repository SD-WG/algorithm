package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/4.
 */
public class GetMinimumDifference530 {

    /**
     * 给定一个二叉收缩树，
     *
     * @param root
     * @return
     */

    int lastValue = -1;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

        preScan(root);

        return minDiff;
    }

    private void preScan(TreeNode root) {

        if (root == null) {
            return;
        }

        preScan(root.left);
        if (lastValue < 0) {
            lastValue = root.val;
        } else {
            int diff = root.val - lastValue;
            if (diff <= minDiff) {
                minDiff = diff;
            }
            lastValue = root.val;
        }
        preScan(root.right);

    }
}
