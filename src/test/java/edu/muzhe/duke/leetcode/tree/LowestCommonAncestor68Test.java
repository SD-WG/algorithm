package edu.muzhe.duke.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/30.
 */
public class LowestCommonAncestor68Test {

    LowestCommonAncestor68 lowestCommonAncestor68 = new LowestCommonAncestor68();

    @Test
    public void lowestCommonAncestor() {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(8);

        TreeNode treeNode1 = lowestCommonAncestor68.lowestCommonAncestor(treeNode, treeNode.left, treeNode.right);
        System.out.println(treeNode1.val);
    }
}