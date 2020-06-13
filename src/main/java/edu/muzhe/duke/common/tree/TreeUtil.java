package edu.muzhe.duke.common.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 这个类用来帮助生成一个本地的Client代理。
 * @author muzhe-wang on 2020/6/4.
 */
public class TreeUtil {

    /**
     * 先序遍历的实现
     *
     * @param root
     * @return
     */
    public static List<Integer> preTraversal(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();
        preTraversal(root, result);
        return result;
    }

    /**
     * 做一个遍历，并将 遍历结果放到result中去
     *
     * @param root
     * @param result
     */
    private static void preTraversal(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }
        result.add(root.value);
        preTraversal(root.left, result);
        preTraversal(root.right, result);
    }

    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> inTraversal(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> result = new ArrayList<>();
        inTraversal(root, result);
        return result;
    }

    /**
     * 中序递归遍历
     *
     * @param root
     * @param result
     */
    private static void inTraversal(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }
        inTraversal(root.left, result);
        result.add(root.value);
        inTraversal(root.right, result);
    }

    /**
     * 后续遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> postTraversal(TreeNode root) {
        //
        return null;
    }

    /**
     * 层次遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> levelTraversal(TreeNode root) {
        //
        return null;
    }

    /**
     * 先序遍历（迭代）
     *
     * @param root
     * @return
     */
    public static List<Integer> preTraversalIteration(TreeNode root) {
        return null;
    }

    /**
     * 中序遍历（迭代）
     *
     * @param root
     * @return
     */
    public static List<Integer> inTraversalIteration(TreeNode root) {
        return null;
    }

    /**
     * 后续遍历（迭代）
     *
     * @param root
     * @return
     */
    public static List<Integer> postTraversalIteration(TreeNode root) {
        return null;
    }

    /**
     * 层次遍历（迭代）
     *
     * @param root
     * @return
     */
    public static List<Integer> levelTraversalIteration(TreeNode root) {
        return null;
    }
}
