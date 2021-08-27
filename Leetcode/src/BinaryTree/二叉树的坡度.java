package BinaryTree;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-13
 * Time: 16:01
 */
public class 二叉树的坡度 {
    int ret = 0;
    public int findTree(TreeNode root){
        if(root == null) return 0;
        int leftSum = findTree(root.left); // 计算当前节点的左子树节点之和
        int rightSum = findTree(root.right); // 计算当前节点的右子树节点之和
        // 计算当前节点的坡度并加入结果
        ret += Math.abs(leftSum - rightSum);
        return root.val + leftSum + rightSum; //二叉树的节点和 = 根节点值 + 左子树和 + 右子树和
    }
    public int findTilt(TreeNode root) {
        findTree(root);
        return ret;
    }
}
