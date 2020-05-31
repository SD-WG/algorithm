package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class IsSameTree100 {

    /**
     * 两棵树是否相同
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            return p.val == q.val &&
                    isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        }
        return false;
    }
}
