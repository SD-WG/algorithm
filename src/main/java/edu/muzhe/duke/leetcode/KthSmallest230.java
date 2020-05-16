package edu.muzhe.duke.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/16.
 */
public class KthSmallest230 {

    /**
     * 第k大的树。使用先序遍历，找到第K大的树。
     * 首先使用递归的方式来实现
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {

        //如何递归的访问 一棵二叉树
        List<Integer> result = new ArrayList<>();
        recursionAccessTree(root, k, result);
        return result.get(k - 1);

    }

    /**
     * 左，中右
     *
     * @param root
     * @param k
     * @param result
     */
    private void recursionAccessTree(TreeNode root, int k, List<Integer> result) {

        if (root == null || result.size() >= k) {
            return;
        }

        recursionAccessTree(root.left, k, result);
        result.add(root.val);
        recursionAccessTree(root.right, k, result);

    }

}
