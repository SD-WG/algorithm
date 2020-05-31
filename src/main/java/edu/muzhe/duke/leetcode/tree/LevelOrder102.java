package edu.muzhe.duke.leetcode.tree;

import java.util.*;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class LevelOrder102 {

    /**
     * 层次顺序访问
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        /**
         * 层次遍历
         */

        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;

    }

}
