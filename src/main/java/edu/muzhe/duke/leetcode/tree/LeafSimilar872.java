package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/6/10.
 */
public class LeafSimilar872 {

    /**
     * 给定两棵树，其中他们的叶子出现的序列相同
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> firstResult = new ArrayList<Integer>();
        inOrderTraversal(root1, firstResult);
        List<Integer> secondResult = new ArrayList<Integer>();
        inOrderTraversal(root2, secondResult);

        if (firstResult.size() != secondResult.size()) {
            return false;
        }
        for (int i = 0; i < firstResult.size(); i++) {
            if (!firstResult.get(i).equals(secondResult.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, result);
        if (root.left == null && root.right == null) {
            result.add(root.val);
        }
        inOrderTraversal(root.right, result);
    }

}
