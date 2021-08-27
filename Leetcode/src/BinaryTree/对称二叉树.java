package BinaryTree;

import Tree.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-23
 * Time: 0:14
 */
public class 对称二叉树 {
    //中序遍历序列 从中间向两边相同
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public boolean isSymmetric(TreeNode root) {
        inorder(root);
        //集合 -> 数组
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
        int len = array.length;
        int i = 0;
        int j = len - 1;
        while(i < len && j > 0){
            if(array[i] != array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

