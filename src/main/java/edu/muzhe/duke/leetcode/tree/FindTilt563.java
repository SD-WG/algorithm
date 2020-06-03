package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/4.
 */
public class FindTilt563 {

    /**
     * 二叉树的坡度
     *
     * @param root
     * @return
     */

    public int findTilt(TreeNode root) {

        //左右子树的和的差的绝对值就是坡度。然后将所有的坡度相加
        if (root == null) {
            return 0;
        }
        int tilt = Math.abs(sum(root.left) - sum(root.right));
        return tilt + findTilt(root.left) + findTilt(root.right);
    }

    private int sum(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

}
