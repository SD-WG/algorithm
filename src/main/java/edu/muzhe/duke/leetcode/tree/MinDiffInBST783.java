package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class MinDiffInBST783 {

    /**
     * //找出bst中，两个元素的差的最小值
     *
     * @param root
     * @return
     */
    int minDiff = Integer.MAX_VALUE;
    boolean isFirstValue = true;
    int firstValue = 0;

    public int minDiffInBST(TreeNode root) {

        minDiffInTree(root);
        return minDiff;

    }

    private void minDiffInTree(TreeNode root) {

        if (root == null) {
            return;
        }

        minDiffInTree(root.left);

        if (isFirstValue) {
            isFirstValue = false;
        } else {
            int diff = root.val - firstValue;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        firstValue = root.val;
        minDiffInTree(root.right);
    }

}
