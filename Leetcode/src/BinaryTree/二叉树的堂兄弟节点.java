package BinaryTree;

import Tree.TreeNode;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-22
 * Time: 19:58
 */
public class 二叉树的堂兄弟节点 {
    public int inorder(TreeNode root, int key,int depth){
        if(root==null)return 0;
        if(root.val==key)return depth;

        return Math.max(inorder(root.left,key,depth+1),inorder(root.right,key,depth+1));
    }
    //求父亲节点
    public TreeNode NodeParent(TreeNode root,int n){
        if(root==null) return null;
        if(root.left!=null&&root.left.val==n){
            return root;
        }
        if(root.right!=null&&root.right.val==n){
            return root;
        }
        TreeNode left= NodeParent(root.left,n);
        TreeNode right= NodeParent(root.right,n);

        return left==null?right:left;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int m = inorder(root,x,0);
        int n = inorder(root,y,0);
        TreeNode a = NodeParent(root,x);
        TreeNode b = NodeParent(root,y);
        return (m == n) && (a != b);
    }
}
