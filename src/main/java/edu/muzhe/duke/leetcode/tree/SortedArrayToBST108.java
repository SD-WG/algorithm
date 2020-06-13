package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class SortedArrayToBST108 {

    /**
     * 这个题我做过
     *
     * @param nums 给定一个二叉树
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    /**
     * 将一个排序数组转变为一个TreeNode 。树
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }
        int rootRank = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[rootRank]);
        root.left = sortedArrayToBST(nums, left, rootRank - 1);
        root.right = sortedArrayToBST(nums, rootRank + 1, right);
        return root;

    }

}
