package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/4.
 */
public class DiameterOfBinaryTree543 {

    /**
     * 找出最大的半径
     *
     * @param root
     * @return
     */

    int maxAns;
    public int diameterOfBinaryTree(TreeNode root) {
        //请求左右孩子节点半径的和左右孩子节点的高度和+1 三者中最大的哪个
        if (root == null) {
            return 0;
        }
        maxAns = 1;
        depth(root);
        return maxAns - 1;
    }
    /**
     * 高度
     *
     * @param root 根节点
     * @return
     */
    private int depth(TreeNode root) {

        //这里可以c一个新的数据结构
        if (root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        maxAns = Math.max(maxAns, l + r + 1);
        return 1 + Math.max(l, r);
    }

}
