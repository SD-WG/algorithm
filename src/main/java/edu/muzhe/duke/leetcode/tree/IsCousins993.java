package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class IsCousins993 {

    /**
     * 判断两个节点是否是堂兄弟节点。
     * 将X 和Y 的高度和 父节点记录下来。然后判断 x,y节点的深度是否相同。
     * 同时判断 x,y 两个节点的父亲节点是否相同，如果相同，就返回true 否者就返回false.
     *
     * @param root
     * @param x
     * @param y
     * @return
     */

    private TreeNode xParent, yParent;
    private int xHeight = -1, yHeight = -1;

    private int targetX, targetY;

    public boolean isCousins(TreeNode root, int x, int y) {

        targetX = x;
        targetY = y;
        dfs(root, 0, null);
        return xHeight >= 0 &&
                xHeight == yHeight &&
                xParent != yParent &&
                xParent != yParent;

    }

    /**
     * @param root
     * @param height
     * @param parent
     */
    private void dfs(TreeNode root, int height, TreeNode parent) {

        if (root == null) {
            return;
        }
        if (xParent != null && yParent != null) {
            return;
        }
        if (root.val == targetX) {
            xParent = parent;
            xHeight = height;
        } else if (root.val == targetY) {
            yParent = parent;
            yHeight = height;
        }
        dfs(root.left, height + 1, root);
        dfs(root.right, height + 1, root);
    }

}
