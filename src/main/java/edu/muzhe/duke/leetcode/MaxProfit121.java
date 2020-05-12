package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/13.
 */
public class MaxProfit121 {

    /**
     * 买卖的最大结果
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        //这个是当前系统中的实现？
        //只能有一次的买卖机会。这里可以转变为连续元素的最大值。可以返回子数组最大的值。
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] letterDiff = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            letterDiff[i - 1] = prices[i] - prices[i - 1];
        }

        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < letterDiff.length; i++) {
            sum += letterDiff[i];
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
