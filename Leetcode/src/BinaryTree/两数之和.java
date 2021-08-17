package BinaryTree;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-16
 * Time: 23:28
 */
public class 两数之和 {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int len = list.size();
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(list.get(i) + list.get(j) == k){
                    return true;
                }
            }
        }
        return false;
    }
}
