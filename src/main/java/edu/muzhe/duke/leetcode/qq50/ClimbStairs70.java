package edu.muzhe.duke.leetcode.qq50;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class ClimbStairs70 {

    /**
     * 这个是一个斐波那契数列的问题。
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        while (second <= n) {
            int three = first + second;
            first = second;
            second = three;
        }
        return second;

    }
}
