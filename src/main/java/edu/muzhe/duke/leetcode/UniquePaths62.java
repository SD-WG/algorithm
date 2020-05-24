package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/24.
 */
public class UniquePaths62 {

    /**
     * 给定一条m*n的网格，机器人处于 （0，0）的位置上。
     * 机器人能够向下和向右移动一个位置
     * 找出 到达 [m-1,n-1]一共有多少种到达的方式。
     * 使用 i 表示 行，j表示列
     * location(i,j) =
     * 1                                         i<=0 || j<= 0
     * location(i-1,j) + location(i,j-1)          (i,j)
     * <p>
     * 这里可以做一个优化。使用一维数组，来记录每一行的记录。
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {

        int[] tempResult = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (m <= 0 || j <= 0) {
                    tempResult[j] = 1;
                } else {
                    tempResult[j] = tempResult[j] + tempResult[j - 1];
                }
            }
        }
        return tempResult[n - 1];

    }

}
