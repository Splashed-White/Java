package Solution;

import Tree.TreeNode;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-13
 * Time: 14:06
 */
public class 二叉树的直径 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        recur(root);
        return max;
    }
    int recur(TreeNode node){
        if(node == null) return -1;
        int leftmax = recur(node.left) + 1;
        int rightmax = recur(node.right) + 1;
        max = Math.max(max, leftmax+rightmax);
        return Math.max(leftmax, rightmax);
    }
}
