package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 9:19
 */

import Node.TreeNode;

/**
 * 已知二叉树的前序序列和中序序列,重构该二叉树
 * 按照前序遍历的根节点root,中序遍历中的root将该序列分为左右两端，分别为该根节点的左右子树，再继续递归执行
 */
public class 二叉树重建 {
    public TreeNode helper(int[] pre, int preStart, int preEnd, int[] vin, int vinStart, int vinEnd) {
        if (preStart > preEnd || vinStart > vinEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = vinStart; i < pre.length; i++) {
            if (vin[i] == pre[preStart]) {
                root.left = helper(pre, preStart + 1, i - vinStart + preStart, vin, vinStart, i - 1);
                root.right = helper(pre, i - vinStart + preStart + 1, preEnd, vin, i + 1, vinEnd);
            }
        }
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        if(pre.length == 0 || vin.length == 0) return null;
        int preStart = 0;
        int preEnd = pre.length - 1;
        int vinStart = 0;
        int vinEnd = vin.length - 1;
        return helper(pre,preStart,preEnd,vin,vinStart,vinEnd);
    }
}
