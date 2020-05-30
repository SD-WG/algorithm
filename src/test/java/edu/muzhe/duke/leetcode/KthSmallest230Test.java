package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.qq50.KthSmallest230;
import edu.muzhe.duke.leetcode.qq50.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/16.
 */
public class KthSmallest230Test {

    @Test
    public void kthSmallest() {
        TreeNode root = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        root.left = node3;
        root.right = node6;
        node3.left = node2;
        node3.right = node4;
        node2.left = node1;

        KthSmallest230 kthSmallest230 = new KthSmallest230();
        int i = kthSmallest230.kthSmallest(root, 3);
        System.out.println(i);
    }
}