package edu.muzhe.duke.leetcode;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class IsValid20 {

    /**
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (isLeftCharacter(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || !isMatch(stack.pop(), s.charAt(i))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * 是否是左右匹配的字符串
     *
     * @param left
     * @param right
     * @return
     */
    private boolean isMatch(char left, char right) {

        return left == '(' && right == ')' ||
                left == '[' && right == ']' ||
                left == '{' && right == '}';
    }

    /**
     * 当前字符是否是一个左边字符串
     */
    private boolean isLeftCharacter(char c) {
        return c == '(' ||
                c == '[' ||
                c == '{';
    }


}
