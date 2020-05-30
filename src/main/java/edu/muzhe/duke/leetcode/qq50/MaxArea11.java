package edu.muzhe.duke.leetcode.qq50;

/**
 * @author muzhe-wang on 2020/5/24.
 */
public class MaxArea11 {

    /**
     * 盛最多水的容器
     * 找出两个rank  rank1  rank2
     * 其中 Min(nums[rank1],nums[rank2]) * (rank2 - rank1);
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        //使用两个指针，。因为这里是找出最大的值。从最大

        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int localArea = Math.min(height[left], height[right]) * (right - left);
            if (localArea > maxArea) {
                maxArea = localArea;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return  maxArea;
    }
}
