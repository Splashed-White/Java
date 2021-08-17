package BinaryTree;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-12
 * Time: 23:15
 */
public class BST的最小绝对差 {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int count = Math.abs(list.get(0) - list.get(1)); //存放两数之间的差值
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(Math.abs(list.get(i) - list.get(j)) < count){
                    count = Math.abs(list.get(i) - list.get(j));
                }
            }
        }
        return count;
    }
}
