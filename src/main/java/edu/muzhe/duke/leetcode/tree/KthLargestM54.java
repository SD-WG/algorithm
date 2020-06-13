package edu.muzhe.duke.leetcode.tree;

import java.util.Stack;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class KthLargestM54 {

    /**
     * 二叉搜索树的第K大的树
     * <p>
     * 右 根 左
     * 中序遍历二叉树
     * <p>
     * 使用中序遍历。这里使用
     *
     * @param root
     * @param k
     * @return
     */

    public int kthLargest(TreeNode root, int k) {


        Stack<TreeNode> stack = new Stack<TreeNode>();
        int rank = 1;
        while (root != null || !stack.isEmpty()) {

            if (root != null) {
                stack.push(root);
                root = root.right;
            } else {
                root = stack.pop();
                if (rank == k) {
                    return root.val;
                }
                rank++;
                root = root.left;
            }

        }
        return -1;


    }


}
