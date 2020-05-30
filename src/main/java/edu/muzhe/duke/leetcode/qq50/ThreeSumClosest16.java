package edu.muzhe.duke.leetcode.qq50;

import java.util.Arrays;

/**
 * @author muzhe-wang on 2020/5/24.
 */
public class ThreeSumClosest16 {

    /**
     * 最接近的target的三数之和
     */
    public int threeSumClosest(int[] nums, int target) {

        int minDistance = Integer.MAX_VALUE;
        int minClosest = 0;
        //假设nums中元素个数大于3个
        Arrays.sort(nums);
        //这里的边界不清晰。这里是有等于这个符号的。
        for (int i = 0; i <= nums.length - 3; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int localSum = nums[i] + nums[left] + nums[right];
                int targetDistance = target - localSum;
                if (targetDistance == 0) {
                    return target;
                } else if (targetDistance < 0) {
                    right--;
                } else {
                    left++;
                }
                if (Math.abs(targetDistance) < minDistance) {
                    minDistance = Math.abs(targetDistance);
                    minClosest = localSum;
                }
            }
        }

        return minClosest;

    }
}
