package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/12.
 */
public class RemoveDuplicates26 {

    /**
     * 删除重复项
     * 首先数组是排好序的。所以相同元素都在一起。
     * 如果从rank = 1的元素开始，和前面一个元素相等的元素
     * 第一个元素一定是不重复的，使用一个rank指向不重复元素的下一个位置.每当遇到不重复的元素就放到rank位置上，然后rank指向下一个位置。
     */
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int noDuplicateRank = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[noDuplicateRank] = nums[i];
                noDuplicateRank++;
            }
        }
        return noDuplicateRank;
    }

}
