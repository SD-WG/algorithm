package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class ReverseWords557 {

    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * 示例 1:
     * 输入: "Let's take LeetCode contest"
     * 输出: "s'teL ekat edoCteeL tsetnoc" 
     * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        int left = 0;
        int right = left;

        while (right < s.length()) {
            if (s.charAt(right) == ' ') {
                for (int i = right - 1; i >= left; i--) {
                    result.append(s.charAt(i));
                }
                result.append(" ");
                left = right + 1;
                right = left;
            } else {
                right++;
            }
        }

        for (int i = right - 1; i >= left; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

}
