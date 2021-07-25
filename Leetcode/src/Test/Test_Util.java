package Test;

import Solution.路径求和;
import Tree.TreeUtil;
import Tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-25
 * Time: 10:54
 */
public class Test_Util {
    public static void main(String[] args) {
        String treeNodeValues = "5,4,11,7,#,#,2,#,#,#,8,13,#,#,4,#,1,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);

        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        System.out.println("创建二叉树成功！");

        /*System.out.println("前序遍历二叉树：");
        treeutil.preOrder(root);
        System.out.println();

        System.out.println("中序遍历二叉树：");
        treeutil.inOrder(root);
        System.out.println();

        System.out.println("后序遍历二叉树：");
        treeutil.postOrder(root);
        System.out.println();*/

        路径求和 num = new 路径求和();
        boolean flag1 = num.hasPathSum(root,22);
        System.out.println(flag1);
    }
}
