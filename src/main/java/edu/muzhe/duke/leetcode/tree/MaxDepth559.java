package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/6/13.
 */
public class MaxDepth559 {

    /**
     * 最大声深度
     *
     * @param root
     * @return
     */
    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }
        int depth = 0;

        for (Node node : root.children) {
            int localDepth = maxDepth(node);
            if (localDepth > depth) {
                depth = localDepth;
            }
        }
        return depth + 1;

    }

}
