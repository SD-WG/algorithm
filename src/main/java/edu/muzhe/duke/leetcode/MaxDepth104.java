package edu.muzhe.duke.leetcode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class MaxDepth104 {


    /**
     * 给定一个二叉树，找出其最大深度。
     * <p>
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * <p>
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        //todo 这个题可以使用迭代的方式实现。看一下这个是如何实现的

        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

}
