package edu.muzhe.duke.leetcode.qq50;

/**
 * @author muzhe-wang on 2020/5/18.
 */
public class FindKthLargest215 {

    /**
     * 找出第K大的数
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {

        //使用快排的实现，找出 nums中的属于的位置


        int left = 0, right = nums.length - 1;
        while (true) {
            int rankIndex = findRank(nums, left, right);
            if (rankIndex == k - 1) {
                return nums[rankIndex];
            } else if (rankIndex < k - 1) {
                left = rankIndex + 1;
            } else {
                right = rankIndex - 1;
            }
        }

    }

    /**
     * 将 比left大的元素移动到左侧，其他的移动到右侧
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private int findRank(int[] nums, int left, int right) {

        int greaterRank = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[left]) {
                greaterRank++;
                swap(nums, greaterRank, i);
            }
        }
        swap(nums, greaterRank, left);
        return greaterRank;
    }

    /**
     * @param nums
     * @param firstRank
     * @param secondRank
     */
    private void swap(int[] nums, int firstRank, int secondRank) {
        int temp = nums[firstRank];
        nums[firstRank] = nums[secondRank];
        nums[secondRank] = temp;
    }

}
