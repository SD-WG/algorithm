package edu.muzhe.duke.leetcode.qq50;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class MaxProfit122 {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * <p>
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * <p>
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     * <p>
     *  
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        //计算出所有的相邻两个元素的差值。然后将正的值都加起来
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - prices[i - 1];
            if (profitToday > 0) {
                sum += profitToday;
            }
        }
        return sum;
    }

}
