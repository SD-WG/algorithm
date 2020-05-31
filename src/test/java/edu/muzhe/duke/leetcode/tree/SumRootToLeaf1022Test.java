package edu.muzhe.duke.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class SumRootToLeaf1022Test {


    @Test
    public void sumRootToLeaf() {

        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(1);
        TreeNode leftLeft = new TreeNode(0);
        TreeNode leftRight = new TreeNode(1);
        TreeNode rightLeft = new TreeNode(0);
        TreeNode rightRight = new TreeNode(1);

        treeNode.left = left;
        treeNode.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        right.left = rightLeft;
        right.right = rightRight;

        SumRootToLeaf1022 sumRootToLeaf1022 = new SumRootToLeaf1022();
        int i = sumRootToLeaf1022.sumRootToLeaf(treeNode);

        System.out.println(i);
    }

    @Test
    public void test() {

        System.out.println((0 << 1) + 1);
    }
}