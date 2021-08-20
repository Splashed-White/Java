package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-21
 * Time: 0:25
 */
public class BST的范围和 {
    public int sum = 0;
    public void inorder(TreeNode root, int low, int high){
        if(root == null) return;
        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
        inorder(root.left,low,high);
        inorder(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root,low,high);
        return sum;
    }
}
