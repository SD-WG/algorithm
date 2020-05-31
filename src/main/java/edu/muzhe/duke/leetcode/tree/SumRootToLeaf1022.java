package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class SumRootToLeaf1022 {

    /**
     * 找出 root节点叶子节点组成的和。
     *
     * @param root
     * @return
     */
    int totalSum = 0;

    public int sumRootToLeaf(TreeNode root) {

        //找出root节点，到每个叶子节点路径上的值。将这些值记录在以List中

        totalSum = 0;
        dfs(root, 0);
        return totalSum;
    }

    private void dfs(TreeNode root, int sum) {

        if (root == null) {
            return;
        }

        sum = (sum << 1) + root.val;
        if (root.left == null && root.right == null) {
            totalSum += sum;
            return;
        }
        //在这个层次中，sum是固定的，在堆栈中是值传递
        dfs(root.left, sum);
        dfs(root.right, sum);
    }


}
