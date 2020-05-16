package edu.muzhe.duke.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/15.
 */
public class Permute46 {

    /**
     * 全排列
     * 全排列：将所有的值添加到nums中去
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] isAccess = new int[nums.length];

        backTrack(nums, temp, result, isAccess);
        return result;
    }

    /**
     * 回溯算法的实现
     *
     * @param nums
     * @param temp
     * @param result
     * @param isAccess
     */
    private void backTrack(int[] nums, List<Integer> temp, List<List<Integer>> result, int[] isAccess) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (isAccess[i] == 1) {
                continue;
            }

            temp.add(nums[i]);
            isAccess[i] = 1;
            backTrack(nums, temp, result, isAccess);
            temp.remove(temp.size() - 1);
            isAccess[i] = 0;

        }

    }


}
