package edu.muzhe.duke.leetcode.qq50;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/16.
 */
public class KthSmallest230 {

    /**
     * 第k大的树。使用先序遍历，找到第K大的树。
     * 首先使用递归的方式来实现
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {

        //第k小的数值 ，这里使用非递归先序中序遍历 左，中，右

        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (root != null || !stack.isEmpty()) {
            //找出第K大的数值
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {

                root = stack.pop();
                k--;
                if (k == 0) {
                    return root.val;
                }
                root = root.right;
            }

        }
        return -1;

    }


}
