package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class Postorder590 {

    /**
     * N叉树后续遍历
     * <p>
     * //根左右
     *
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {

        List<Integer> result = new ArrayList<>();
        postOrderTranvr(root, result);
        return result;

    }

    /**
     * 后续遍历root节点
     *
     * @param root
     * @param result
     */
    private void postOrderTranvr(Node root, List<Integer> result) {

        if (root == null) {
            return;
        }
        if (root.children != null) {
            for (Node node : root.children) {
                postOrderTranvr(node, result);
            }
        }
        result.add(root.val);
    }

}
