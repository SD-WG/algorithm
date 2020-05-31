package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class LevelOrderBottom107 {

    /**
     * 层次遍历 。返回从底部到最高层的返回的结果
     * 这里先从底部向搞成
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        int depth = calculateDepth(root);
        List<List<Integer>> levelOrderValue = new ArrayList<>(depth);
        dfs(root, 0, levelOrderValue);
        Collections.reverse(levelOrderValue);
        return levelOrderValue;

    }

    /**
     * dfs的深度遍历
     *
     * @param root
     * @param level
     * @param result
     */
    private void dfs(TreeNode root, int level, List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        putValue(root.val, level, result);
        dfs(root.left, level + 1, result);
        dfs(root.right, level + 1, result);

    }

    /**
     * 将属于 level层次的val添加到 result中去
     *
     * @param val
     * @param level
     * @param result
     */
    private void putValue(int val, int level, List<List<Integer>> result) {

        if (result.size() <= level) {
            List<Integer> temp = new ArrayList<>();
            temp.add(val);
            result.add(temp);
        } else {
            result.get(level).add(val);
        }

    }

    /**
     * 计算 深度，看一下是如何实现的
     *
     * @param root
     * @return
     */
    private int calculateDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(calculateDepth(root.left), calculateDepth(root.right)) + 1;
    }

}
