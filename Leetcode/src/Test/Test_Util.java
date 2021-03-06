package Test;

import BinaryTree.*;
import Tree.TreeUtil;
import Tree.TreeNode;
import com.sun.javaws.IconUtil;
import sun.reflect.generics.tree.Tree;

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
        /*String treeNodeValues = "4,2,1,#,#,3,#,#,7,6,#,#,9,#,#";
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
        System.out.println();*/

        //左叶子和
        /*String treeNodeValues = "1,2,4,#,#,5,#,#,3,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        左叶子和 num4 = new 左叶子和();
        int a = num4.sumOfLeftLeaves(root);
        System.out.println(a);*/

        //BST的众数
        /*//String treeNodeValues = "1,#,2,2,#,#,#";
        //String treeNodeValues = "1,#,2";
        //String treeNodeValues = "2,#,3,#,4,#,5,#,6,#,#";
        String treeNodeValues = "1,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        BST的众数 num5 = new BST的众数();
        *//*List<Integer> r1 = num5.inorder(root);
        System.out.println(r1);*//*
        int[] ret = num5.findMode(root);
        System.out.println(Arrays.toString(ret));*/

        /*//BST的最小绝对差
        String treeNodeValues = "4,2,1,#,#,3,#,#,6,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        BST的最小绝对差 num6 = new BST的最小绝对差();
        int ret = num6.getMinimumDifference(root);
        System.out.println(ret);*/

        /*//二叉树的直径
        String treeNodeValues = "4,2,#,#,1,2,4,6,0,#,2,#,#,1,2,#,#,#,#,2,1,1,#,#,#,2,2,2,#,#,#,#,2,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树的直径 num7 = new 二叉树的直径();
        int ret = num7.diameterOfBinaryTree(root);
        System.out.println(ret);*/

        //二叉树的坡度
        /*String treeNodeValues = "4,2,3,#,#,5,#,#,9,#,7,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树的坡度 num8 = new 二叉树的坡度();
        int ret = num8.findTilt(root);
        System.out.println(ret);*/

        //二叉树的层平均值
        /*String treeNodeValues = "3,9,#,#,20,15,#,#,7,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树的层平均值 num9 = new 二叉树的层平均值();
        List<Double> ret = num9.averageOfLevels(root);
        System.out.println(ret);*/

        //二叉树中的第二小节点
        /*String treeNodeValues = "4,6,10,#,#,6,#,#,4,4,#,#,5,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树中的第二小节点 num10 = new 二叉树中的第二小节点();
        int ret = num10.findSecondMinimumValue(root);
        System.out.println(ret);*/

        //BST中的搜索
        /*String treeNodeValues = "4,2,1,#,#,3,#,#,7,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        int val = 2;
        BST中的搜索 num11 = new BST中的搜索();
        TreeNode p  = num11.searchBST(root,val);
        System.out.println("前序遍历二叉树：");
        treeutil.preOrder(p);
        System.out.println();*/

        //叶子相似的树
        /*String treeNodeValues1 = "1,#,#";
        String treeNodeValues2 = "2,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        treeutil.setValues(treeNodeValues2);
        TreeNode root1 = new TreeNode();
        root1 = TreeUtil.createTree();
        TreeNode root2 = new TreeNode();
        root2 = TreeUtil.createTree();
        叶子相似的树 num12 = new 叶子相似的树();
        boolean flag = num12.leafSimilar(root1,root2);
        System.out.println(flag);*/

        //二叉树的堂兄弟节点
        /*String treeNodeValues1 = "1,2,4,#,#,#,3,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        int x = 4;
        int y = 3;
        二叉树的堂兄弟节点 num13 = new 二叉树的堂兄弟节点();
        boolean flag2 = num13.isCousins(root,x,y);
        System.out.println(flag2);*/

        //二叉树的镜像
        /*//String treeNodeValues1 = "4,2,1,#,#,3,#,#,7,6,#,#,9,#,#";
        String treeNodeValues1 = "1,2,#,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树的镜像 num14 = new 二叉树的镜像();
        TreeNode node = num14.mirrorTree(root);
        System.out.println("前序遍历二叉树：");
        treeutil.preOrder(node);
        System.out.println();*/

        //对称二叉树
        /*String treeNodeValues1 = "1,2,2,#,#,2,#,#,2,#,2,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        对称二叉树 num15 = new 对称二叉树();
        boolean flag5 = num15.isSymmetric(root);
        System.out.println(flag5);*/

        //二叉树的平衡
        /*String treeNodeValues1 = "1,2,3,4,#,#,#,#,2,#,3,#,4,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        二叉树的平衡 num16 = new 二叉树的平衡();
        boolean flag6 = num16.isBalanced(root);
        System.out.println(flag6);*/

        //BST的第K大节点
        /*//String treeNodeValues1 = "3,1,#,2,#,#,4,#,#";
        String treeNodeValues1 = "5,3,2,1,#,#,#,4,#,#,6,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        BST的第K大节点 num17 = new BST的第K大节点();
        int ret = num17.kthLargest(root,3);
        System.out.println(ret);*/

        //BiNode
        String treeNodeValues1 = "4,2,1,0,#,#,#,3,#,#,5,#,6,#,#";
        TreeUtil treeutil = new TreeUtil();
        treeutil.setValues(treeNodeValues1);
        TreeNode root = new TreeNode();
        root = TreeUtil.createTree();
        BiNode num18 = new BiNode();
        TreeNode node = num18.convertBiNode(root);
        System.out.println("中序遍历二叉树：");
        treeutil.inOrder(node);
        System.out.println();

    }
}
