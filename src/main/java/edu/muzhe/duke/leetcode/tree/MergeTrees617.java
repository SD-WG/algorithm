package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class MergeTrees617 {

    /**
     * 将两棵树进行合并
     * 最终返回的结果是t1这棵树
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 != null) {
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        } else {
            return t1 == null ? t2 : t1;
        }

    }

}
