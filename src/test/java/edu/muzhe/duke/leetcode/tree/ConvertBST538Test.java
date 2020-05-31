package edu.muzhe.duke.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class ConvertBST538Test {

    @Test
    public void convertBST() {

        TreeNode treeNode = new TreeNode(5);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(13);

        treeNode.left = leftNode;
        treeNode.right = rightNode;

        ConvertBST538 convertBST538 = new ConvertBST538();
        convertBST538.convertBST(treeNode);
    }
}