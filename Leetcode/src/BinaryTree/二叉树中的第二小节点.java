package BinaryTree;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-17
 * Time: 14:37
 */
public class 二叉树中的第二小节点 {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        int len = list.size();
        System.out.println("升序后序列：");
        Collections.sort(list); // 升序排列
        //[4, 4, 4, 5, 6, 6, 10]
        System.out.println(list);
        for(int i = 0; i < len; i++){
            int min = list.get(0);
            if(list.get(i) != min){
                return list.get(i);
            }
        }
        return -1;
    }
}
