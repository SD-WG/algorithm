package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class BinaryTreePaths257 {

    /**
     * 二叉树的所有的路径
     * <p>
     * 从第一个开始
     *
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {

        /**
         * 根，左，右
         * 这个使用回溯算法来试下
         */
        List<String> result = new ArrayList<>();
        allBinaryTreePaths(root, "", result);
        return result;

    }

    /**
     * 找出素有的pant
     *
     *
     * @param root
     * @param path
     * @param result
     */
    private void allBinaryTreePaths(TreeNode root, String path, List<String> result) {

        if (root == null) {
            return;
        }

        path += String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            result.add(path);
        } else {
            path += "->";
            allBinaryTreePaths(root.left, path, result);
            allBinaryTreePaths(root.right, path, result);
        }

    }


}
