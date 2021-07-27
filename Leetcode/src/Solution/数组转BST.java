package Solution;

import Tree.TreeNode;
import sun.reflect.generics.tree.Tree;

import static Solution.二叉树高度.getHeight;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-26
 * Time: 13:06
 */
public class 数组转BST {
    /*public int[] convert(TreeNode root){

        return
    }*//*
    public TreeNode adjustTree(TreeNode root){
        TreeNode p = root;
        root = root.right;
        root.left = p;
        return root;
    }
    boolean isBalance(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1){
            return (isBalance(root.left) && isBalance(root.right));
        }else{
            return false; ////当前节点已失衡
        }
    }*/


    public TreeNode toBST(int[] nums,int low,int high){
        if(low > high){
            return null;
        }
        if(low == high){
            TreeNode root = new TreeNode(nums[low]);
            return root;
        }
        int mid = (low+high)/2; //中间节点为根节点
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums,low,mid-1);
        root.right = toBST(nums,mid+1,high);
        /*
        TreeNode left = toBST(nums,low,mid-1);
        TreeNode right = toBST(nums,mid+1,high);
        if(left != null){
            root.left = left;
        }
        if(right != null){
            root.right = right;
        }*/
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }
}
