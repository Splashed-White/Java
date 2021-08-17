package BinaryTree;

import Tree.TreeNode;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-06
 * Time: 9:05
 */
public class 左叶子和 {
    public static int num = 0;
    public static int preorder(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        if(root.left != null){
            num += root.left.val;
        }
        preorder(root.left);
        preorder(root.right);
        return num;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return preorder(root);
    }
}
