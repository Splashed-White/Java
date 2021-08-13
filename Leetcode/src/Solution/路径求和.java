package Solution;

import Tree.TreeNode;
import Tree.TreeUtil;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-31
 * Time: 15:57
 */
public class 路径求和 {
    public boolean helper(TreeNode root,int sum, int targetSum){
        //把节点的值放入递归里
        if(root == null) {
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                return true;
            }
        }
        return helper(root.left,sum,targetSum) || helper(root.right,sum,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean flag = helper(root,0,targetSum);
        return flag;
    }
}
