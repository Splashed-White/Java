package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-24
 * Time: 1:22
 */
public class 二叉树的平衡 {
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? (leftHeight + 1) : (rightHeight + 1);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if(Math.abs(l - r) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
