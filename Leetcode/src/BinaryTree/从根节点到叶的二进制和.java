package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-22
 * Time: 21:41
 */
public class 从根节点到叶的二进制和 {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (sum << 1) + root.val;
        //叶子节点直
        if(root.left == null && root.right == null) return sum;
        //递归
        return helper(root.left, sum) + helper(root.right, sum);
    }
}
