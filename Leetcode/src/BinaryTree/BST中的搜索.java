package BinaryTree;

import Tree.TreeNode;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-17
 * Time: 16:14
 */
public class BST中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val < val){
            return searchBST(root.right, val);
        }
        if(root.val > val){
            return searchBST(root.left, val);
        }
        return root;
    }
}