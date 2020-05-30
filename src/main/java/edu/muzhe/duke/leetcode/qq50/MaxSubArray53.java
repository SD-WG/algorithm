package edu.muzhe.duke.leetcode.qq50;

/**
 * @author muzhe-wang on 2020/5/12.
 */
public class MaxSubArray53 {

    /**
     * 找出最大子数组的和。
     * 有一个值记录当前最大值，如果当前的和比最大值大就更新最大值。
     * 如果当前和比0大就继续，如果当前和比 0小就将当前值设置为0；
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

}
