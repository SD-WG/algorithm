package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class ConvertBST538 {

    /**
     * 把二叉树转变为累加树
     * <p>
     * 搜索树的特点是：左 根  右 的结果 依次递增。
     * 这里的实现方式是  先访问右， 然后访问 根 。然后访问  左节点。然后将所有节点都累加起来
     * 因为这里只需要其中的val值
     * <p>
     * 右  根 左 右
     *
     * @param root
     * @return
     */
    int sum = 0;

    //这个是一个递归的方式来实现的。这里可以使用。这里可以使用非递归的实现
    public TreeNode convertBST(TreeNode root) {


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
