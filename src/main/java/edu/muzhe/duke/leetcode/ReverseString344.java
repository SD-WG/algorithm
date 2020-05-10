package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class ReverseString344 {

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     * <p>
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     * <p>
     * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
     * <p>
     *
     * @param s
     */
    public void reverseString(char[] s) {

        //翻转字符串，看一下这些翻转是如何实现的。

        if (s == null || s.length < 2) {
            return;
        }

        int left = 0, right = s.length - 1;

        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }

    }

    private void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}