package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/16.
 */
public class ProductExceptSelf238 {

    /**
     * 除自身以外的所有数的乘积
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = result.length - 1; i >= 0; i--) {
            if (i == result.length - 1) {
                result[i] = 1;
            } else {
                result[i] = result[i + 1] * nums[i + 1];
            }
        }

        int lastValue = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                lastValue = nums[i];
                nums[i] = 1;
            } else {
                int tempResult = nums[i - 1] * lastValue;
                lastValue = nums[i];
                nums[i] = tempResult;
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = result[i] * nums[i];
        }
        return result;

    }


}
