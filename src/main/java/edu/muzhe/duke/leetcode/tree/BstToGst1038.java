package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class BstToGst1038 {

    /**
     *
     * @param root
     * @return
     */
    public TreeNode bstToGst(TreeNode root) {

        TreeNode node = root;
        if (node == null) {
            return node;
        }
        int sum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                sum = node.val + sum;
                node.val = sum;
                node = node.left;
            }
        }

        return root;
    }
}
