package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: BST -> 单链表 原址操作
 * User: TL
 * Date: 2021-08-27
 * Time: 16:00
 */
public class BiNode {
    public TreeNode prev = null;
    public void inorder(TreeNode cur) {
        if(cur == null) return;
        inorder(cur.left);
        if(prev != null){
            prev.right = cur;
        }
        prev = cur;
        cur.left = null;
        inorder(cur.right);
    }
    public TreeNode convertBiNode(TreeNode root) {
        if(root == null) return null;
        //找头节点
        TreeNode head = root;
        while(head.left != null){
            head = head.left;
        }
        inorder(root);
        return head;
    }
}
