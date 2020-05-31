package edu.muzhe.duke.leetcode.tree;

/**
 * @author muzhe-wang on 2020/5/31.
 */
public class Tree2str606 {

    /**
     * 将所有的树形的值
     *
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {

        if (t == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        tree2StrTemp(t, stringBuilder);
        return stringBuilder.toString();
    }

    private void tree2StrTemp(TreeNode t, StringBuilder stringBuilder) {

        if (t == null) {
            return;
        }

        //先序遍历
        stringBuilder.append(t.val);
        if (t.left == null && t.right == null) {
            return;
        }


        stringBuilder.append("(");
        tree2StrTemp(t.left, stringBuilder);
        stringBuilder.append(")");

        if (t.right != null) {
            stringBuilder.append("(");
            tree2StrTemp(t.right, stringBuilder);
            stringBuilder.append(")");
        }
    }

}
