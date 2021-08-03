package Solution;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-03
 * Time: 17:02
 */
public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        if(left == null && right == null) return root;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
    }
}
