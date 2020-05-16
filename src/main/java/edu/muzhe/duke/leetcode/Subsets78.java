package edu.muzhe.duke.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/15.
 */
public class Subsets78 {

    /**
     * 返回所有子集
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backTrack(nums, 0, temp, result);
        return result;

    }

    /**
     * 回溯算法的实现
     *
     * @param nums
     * @param startIndex
     * @param temp
     * @param result
     */
    private void backTrack(int[] nums, int startIndex, List<Integer> temp, List<List<Integer>> result) {

        result.add(new ArrayList<>(temp));

        for (int i = startIndex; i < nums.length; i++) {
            temp.add(nums[i]);
            backTrack(nums, i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }

    }
}
