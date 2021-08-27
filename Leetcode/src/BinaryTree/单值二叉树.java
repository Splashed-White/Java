package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-20
 * Time: 0:03
 */
public class 单值二叉树 {
    public boolean inorder(TreeNode root,int key){
        if(root == null) return true;;
        if(root.val != key){
            return false;
        }
        return inorder(root.left,key) && inorder(root.right,key);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int key = root.val;
        return inorder(root,key);
    }
}
