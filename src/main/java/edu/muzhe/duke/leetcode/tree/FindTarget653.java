package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/6/10.
 */
public class FindTarget653 {

    /**
     * 发现两数之和
     * 这个题从左左边和最右边的两个数分别添加到数组中。中序遍历：
     * 这个题先中序遍历，然后
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {

        //这里将root进行中序排列，然后找出两个值 = k的实现
        List<Integer> result = new ArrayList<Integer>();
        inOrderTraversal(root, result);

        if (result.size() < 2) {
            return false;
        }

        int left = 0, right = result.size() - 1;

        while (left < right) {
            int sum = result.get(left) + result.get(right);
            if (sum < k) {
                left++;
            } else if (sum > k) {
                right--;
            } else {
                return true;
            }
        }
        return false;

    }

    /**
     * 中序遍历
     *
     * @param root
     * @param result
     */
    private void inOrderTraversal(TreeNode root, List<Integer> result) {

        if (root == null){
            return;
        }
        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right, result);
    }

}
