package edu.muzhe.duke.leetcode.tree;

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
    int result = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return result;
        }
        rangeSumBST(root.left, L, R);
        if (root.val >= L && root.val <= R) {
            result += root.val;
        }
        rangeSumBST(root.right, L, R);
        return result;
    }

}
