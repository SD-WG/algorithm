package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class Merge88 {

    /**
     * 合并两个有序数组
     * <p>
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //从小到大排序会有问题，从大到小移动就好

        int firstRank = m - 1;
        int secondRank = n - 1;
        int sequence = m + n - 1;

        while (firstRank >= 0 || secondRank >= 0) {
            if (firstRank < 0) {
                nums1[sequence--] = nums2[secondRank--];
            } else if (secondRank < 0) {
                break;
            } else if (nums1[firstRank] < nums2[secondRank]) {
                nums1[sequence--] = nums2[secondRank--];
            } else {
                nums1[sequence--] = nums1[firstRank--];
            }
        }

    }

}
