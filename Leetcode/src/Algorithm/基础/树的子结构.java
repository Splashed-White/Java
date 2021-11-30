package Algorithm.基础;

import Node.TreeNode;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-29
 * Time: 9:00
 */

/**
 * 子树判定：输入两颗二叉树A,B,判断B是不是A的子结构; 规定空树不是任何一颗树的子结构
 */
public class 树的子结构 {
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null) return false;
        //当前节点值相同
        //左子树结构相同
        //右子树结构相同
        //三者需同时满足 &&
        return root1.val == root2.val && helper(root1.left,root2.left) && helper(root1.right,root2.right);
    }
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        //当前树的结构相同
        //左子树当中有相同
        //右子树当中有相同
        //三者满足其一即可 ||
        return helper(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
}
