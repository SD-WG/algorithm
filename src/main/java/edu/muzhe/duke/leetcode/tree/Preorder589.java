package edu.muzhe.duke.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muzhe-wang on 2020/6/4.
 */
public class Preorder589 {

    /**
     * 多叉树的中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();
        preScan(root, result);
        return result;
    }

    /**
     * 从根节点开始进行先序遍历
     *
     * @param root
     * @param result
     */
    private void preScan(Node root, List<Integer> result) {

        if (root == null) {
            return;
        }
        result.add(root.val);
        for (Node node : root.children) {
            preScan(node, result);
        }
        
    }

}
