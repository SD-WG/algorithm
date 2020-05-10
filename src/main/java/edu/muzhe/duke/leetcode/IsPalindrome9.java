package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class IsPalindrome9 {

    /**
     * 是否是一个回文数
     * 1011
     * <p>
     * 如何依次获取到
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int lowBase = 1;
        int highBase = 1;

        while (x / highBase >= 10) {
            highBase *= 10;
        }

        while (highBase > lowBase) {
            int lowValue = x / lowBase % 10;
            int highValue = x / highBase % 10;
            if (lowValue != highValue) {
                return false;
            }
            lowBase *= 10;
            highBase /= 10;
        }
        return true;

    }

}
