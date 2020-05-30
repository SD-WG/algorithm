package edu.muzhe.duke.leetcode.qq50;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class MajorityElement169 {

    /**
     * 多数元素
     * 出现超过一半元素长度的哪个元素。
     * <p>
     * 因为超过了一半，所以最后num一定是这个元素
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int num = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                num = nums[i];
            } else {
                if (nums[i] == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return num;

    }
}
