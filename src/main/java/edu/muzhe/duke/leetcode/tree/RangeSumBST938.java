package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class RangeSumBST938 {

    /**
     * 使用中序遍历
     *
     * @param root
     * @param L
     * @param R
     * @return
     */

    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return 0;
        }

        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {

            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.val >= L && root.val <= R) {
                    result += root.val;
                }
                root = root.right;
            }
        }
        return result;
    }

}
