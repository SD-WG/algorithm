package edu.muzhe.duke.common.tree;

import java.util.*;

/**
 * 这里主要用来各种tree的访问方式。
 *
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
    public static List<Integer> inOrderTraversal(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    /**
     * 中序递归遍历
     *
     * @param root
     * @param result
     */
    private static void inOrderTraversal(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, result);
        result.add(root.value);
        inOrderTraversal(root.right, result);
    }

    /**
     * 后续遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> postTraversal(TreeNode root) {
        //
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<Integer>();
        postOrderTraversal(root, result);
        return result;
    }

    /**
     * 递归后续遍历
     *
     * @param root
     * @param result
     */
    private static void postOrderTraversal(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        postOrderTraversal(root.left, result);
        postOrderTraversal(root.right, result);
        result.add(root.value);

    }

    /**
     * 层次遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> levelTraversal(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;

    }

    /**
     * 先序遍历（迭代）
     *
     * @param root
     * @return
     */
    public static List<Integer> preTraversalIteration(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                root = stack.pop();
                root = root.right;
            } else {
                stack.push(root);
                result.add(root.value);
                root = root.left;
            }
        }
        return result;

    }

    /**
     * 中序遍历（迭代）
     * left-root- right
     *
     * @param root
     * @return
     */
    public static List<Integer> inTraversalIteration(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || stack.isEmpty()) {
            if (root == null) {
                root = stack.pop();
                result.add(root.value);
                root = root.right;
            } else {
                stack.add(root);
                root = root.left;
            }
        }
        return result;
    }

    /**
     * 后续遍历（迭代）
     * 左 - 右 - 根
     * 根 - 左 - 右
     *
     * @param root
     * @return
     */
    public static List<Integer> postTraversalIteration(TreeNode root) {

        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                //当前root值null .
                root = stack.pop();
                root = root.left;
            } else {
                result.add(root.value);
                stack.add(root);
                root = root.right;
            }
        }

        Collections.reverse(result);
        return result;

    }
}
