package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.base.ListNode;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class LowestCommonAncestor235 {

    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * <p>
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     * <p>
     * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        /**
         * 如果出现root 介于 {p ,q}之间，这个时候返回的结果就是当前系统中的关键了。
         */

        TreeNode leftNode, rightNode;
        if (p.val < q.val) {
            leftNode = p;
            rightNode = q;
        } else {
            leftNode = q;
            rightNode = p;
        }

        while (true) {
            if (root.val == leftNode.val || root.val == rightNode.val || (root.val > leftNode.val && root.val < rightNode.val)) {
                return root;
            } else if (root.val < leftNode.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

    }

}
