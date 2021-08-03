package Test;

import Solution.数组转BST;
import Solution.翻转二叉树;
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
        /*String treeNodeValues = "5,4,11,7,#,#,2,#,#,#,8,13,#,#,4,#,1,#,#"; //前序
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);

        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        System.out.println("创建二叉树成功！");*/

        /*System.out.println("前序遍历二叉树：");
        treeutil.preOrder(root);
        System.out.println();

        System.out.println("中序遍历二叉树：");
        treeutil.inOrder(root);
        System.out.println();

        System.out.println("后序遍历二叉树：");
        treeutil.postOrder(root);
        System.out.println();

        路径求和 num1 = new 路径求和();
        boolean flag1 = num1.hasPathSum(root,22);
        System.out.println(flag1);*/

        //数组转BST
        /*数组转BST num2 = new 数组转BST();
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = num2.sortedArrayToBST(nums);
        System.out.println("前序遍历二叉树：");
        TreeUtil treeutil = new TreeUtil();
        treeutil.preOrder(root);
        System.out.println();*/

        //翻转二叉树
        String treeNodeValues = "4,2,1,#,#,3,#,#,7,6,#,#,9,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        System.out.println("原二叉树前序遍历：");
        treeutil.preOrder(root);
        System.out.println();
        翻转二叉树 num3 = new 翻转二叉树();
        num3.invertTree(root);
        System.out.println("翻转后二叉树前序遍历：");
        treeutil.preOrder(root);
        System.out.println();
    }
}
