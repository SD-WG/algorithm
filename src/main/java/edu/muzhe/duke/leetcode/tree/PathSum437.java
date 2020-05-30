package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class PathSum437 {

    /**
     * 给定一个二叉树，给定某一个路径的和是 sum 。
     *
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {

        /**
         * 这里的结果有三种，
         * 以root为根的和为sum的元素个数。
         * 以root.left和root.right为根的和为sum的
         */
        if (root == null) {
            return 0;
        }
        //在根节点中国，所有的以为当前节点为初始节点的其中和为sum的所有节点路径条数
        int rootResult = count(root, sum);
        int leftResult = pathSum(root.left, sum);
        int rightResult = pathSum(root.right, sum);
        return rootResult + leftResult + rightResult;

    }

    /**
     * 计算root节点的sum
     *
     * @param root
     * @param sum
     * @return
     */
    private int count(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0 ? 1 : 0;
        return result + count(root.left, sum) + count(root.right, sum);

    }
}
