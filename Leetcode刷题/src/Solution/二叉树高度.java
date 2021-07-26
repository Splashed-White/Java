package Solution;

import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-26
 * Time: 14:19
 */
public class 二叉树高度 {
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? (leftHeight + 1) : (rightHeight + 1);
        /*if(leftHeight > rightHeight){
            return leftHeight +1;
        }else{
            return rightHeight + 1;
        }*/
    }
}
