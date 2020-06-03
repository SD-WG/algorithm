package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/2.
 */
public class IsSubtree572 {

    /**
     * 是否是子树
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }

        return isSamTree(s, t) ||
                isSamTree(s.left, t) ||
                isSamTree(s.right, t);

    }

    private boolean isSamTree(TreeNode s, TreeNode t) {

        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.val != t.val) {
            return false;
        }
        return isSamTree(s.left, t.left) && isSamTree(s.right, t.right);
    }
}
