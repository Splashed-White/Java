package BinaryTree;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-27
 * Time: 14:19
 */
public class BST的第K大节点 {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int kthLargest(TreeNode root, int k) {
        inorder(root);
        int len = list.size();
        int index = len - k;
        int ret = 0;
        for(int i = 0; i <= index; i++){
            ret = list.get(i);
        }
        return ret;
    }
}
