package edu.muzhe.duke.leetcode.qq50;

import java.util.Arrays;

/**
 * @author muzhe-wang on 2020/5/13.
 */
public class ContainsDuplicate217 {

    /**
     * 是否包含了重复的元素.
     * 这里首先对这个算法进行排序，然后进行一次比较相邻的元素是否存在
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length < 2) {
            return true;
        }
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

}
