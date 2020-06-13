package edu.muzhe.duke.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class InvertTree226 {

    /**
     * 翻转二叉树
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode finalRoot = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.poll();
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }

        }
        return finalRoot;
    }


}
