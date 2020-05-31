package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class BinaryTreePaths257 {

    /**
     * 二叉树的所有的路径
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
        List<TreeNode> temp = new ArrayList<>();
        backtrack(root, temp, result);
        return result;

    }

    /**
     * 回溯当前节点
     * 处理当前节点：如果root节点是
     *
     * @param root
     * @param temp
     * @param result
     */
    private void backtrack(TreeNode root, List<TreeNode> temp, List<String> result) {

        if (root == null) {
            return;
        }

        if (root.right == null && root.left == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < temp.size(); i++) {
                stringBuilder.append(temp.get(i).val).append("->");
            }
            stringBuilder.append(root.val);
            result.add(stringBuilder.toString());
            return;
        }

        temp.add(root);
        if (root.left != null) {
            backtrack(root.left, temp, result);
        }

        if (root.right != null) {
            backtrack(root.right, temp, result);
        }
        temp.remove(temp.size() - 1);


    }

}
