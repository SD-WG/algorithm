package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class SortedArrayToBSTM0402 {

    /**
     * @param nums
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBst(nums, 0, nums.length - 1);

    }

    /**
     * 将数组 nums 中 [left,right] 的元素转变为一个二叉树
     *
     * @param nums
     * @param left
     * @param righ
     * @return
     */
    private TreeNode sortedArrayToBst(int[] nums, int left, int righ) {

        if (left > righ) {
            return null;
        }
        int rootRank = left + (righ - left) / 2;
        TreeNode root = new TreeNode(nums[rootRank]);
        root.left = sortedArrayToBst(nums, left, rootRank - 1);
        root.right = sortedArrayToBst(nums, rootRank + 1, righ);
        return root;
    }

}
