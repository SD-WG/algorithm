package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class LongestCommonPrefix14 {

    /**
     * 找出最长公共前缀
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {

        //找出字符串中长度最短的，这个可能是最短的路径

        if (strs.length == 0) {
            return "";
        }

        int maxLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < maxLength) {
                maxLength = strs[i].length();
            }
        }

        int maxLen = 0;
        while (maxLen < maxLength) {
            for (int j = 1; j < strs.length; j++) {
                char ch = strs[0].charAt(maxLen);
                if (strs[j].charAt(maxLen) != ch) {
                    return strs[0].substring(maxLen + 1);
                }
            }
            maxLen++;
        }
        return strs[0].substring(maxLen);

    }
}
