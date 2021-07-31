/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-31
 * Time: 15:17
 */
public class 路径总和 {
    public boolean helper(TreeNode root,int sum, int targetSum){
        //把节点的值放入递归里
        if(root == null) {
            return false;
        }
        sum += root.val;
        if(sum == targetSum){
            return true;
        }
        helper(root.left,sum,targetSum);
        helper(root.right,sum,targetSum);
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean flag = helper(root,0,targetSum);
        return flag;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.hasPathSum();
    }
}
