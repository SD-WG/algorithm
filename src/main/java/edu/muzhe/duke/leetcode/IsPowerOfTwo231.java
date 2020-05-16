package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class IsPowerOfTwo231 {

    /**
     * 是否2的幂
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        } else if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);

    }

}
