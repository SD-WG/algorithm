package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/6/1.
 */
public class AverageOfLevels637 {

    /**
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {

        List<Pair> list = new ArrayList<>();

        sumOfLevel(root, 0, list);

        //将list转变为result
        List<Double> result = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).calResult());
        }
        return result;

    }

    /**
     * 使用dfs访问将每一层的节点添加到list中去
     *
     * @param root
     * @param depth
     * @param list
     */
    private void sumOfLevel(TreeNode root, int depth, List<Pair> list) {

        if (root == null) {
            return;
        }
        addValue(root, depth, list);
        sumOfLevel(root.left, depth + 1, list);
        sumOfLevel(root.right, depth + 1, list);
    }

    /**
     * 添加value值
     *
     * @param root
     * @param depth
     * @param list
     */
    private void addValue(TreeNode root, int depth, List<Pair> list) {

        if (list.size() <= depth) {
            Pair pair = new Pair(depth);
            pair.sum += root.val;
            pair.count = 1;
            list.add(pair);
        } else {
            Pair pair = list.get(depth);
            pair.sum += root.val;
            pair.count += 1;
        }

    }

    private class Pair {

        /**
         * 元素个数
         */
        double sum = 0;

        /**
         * 元素个数
         */
        int count = 0;

        /**
         * 深度
         */
        int depth;

        /**
         * 获取到pair的值
         *
         * @param depth
         */
        public Pair(int depth) {
            this.depth = depth;
        }

        /**
         * 计算结果
         *
         * @return
         */
        public double calResult() {
            return this.sum / count;
        }
    }

}
