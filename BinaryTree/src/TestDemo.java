import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试文件
 * User: TL
 * Date: 2021-07-19
 * Time: 23:48
 */
public class TestDemo {
    public static void main(String[] args) {
        createTree createTree = new createTree();
        //List<Character> list = new ArrayList<>();
        //BinaryTree binaryTree = new BinaryTree();
        //TreeNode root = binaryTree.createTree();

        /**
         * Traversal
         */
        TreeNode root = createTree.createTree();
        Traversal traversal = new Traversal();
        traversal.preOrderTraversal(root); //前序遍历- 递归
        System.out.println(); //A B D E H C F G
        traversal.inOrderTraversal(root);  //中序遍历- 递归
        System.out.println(); //D B E H A F C G
        traversal.postOrderTraversal(root); //后序遍历- 递归
        System.out.println(); //D H E B F G C A

        traversal. preOrderTraversalNor(root); //前序遍历- 非递归
        System.out.println(); //A B D E H C F G
        traversal. inOrderTraversalNor(root); //中序遍历- 非递归
        System.out.println(); //D B E H A F C G
        traversal. postOrderTraversalNor(root); //后序遍历- 非递归
        System.out.println(); //D H E B F G C A

        traversal.levelOrderTraversal(root);
        System.out.println();

        /**
         * BasicMethods
         */
        BasicMethods basicMethods = new BasicMethods();
        basicMethods.getSize1(root);
        System.out.println(BasicMethods.size); //8
        int ret1 = basicMethods.getSize2(root);
        System.out.println("结点个数 = " + ret1); //8

        basicMethods.getLeafSize1(root);
        System.out.println(BasicMethods.leafSize); //4
        int ret2 = basicMethods.getLeafSize2(root);
        System.out.println("叶子结点个数 = " + ret2); //4

        int ret3 = basicMethods.getKLevelSize(root,4);
        System.out.println("第k层结点个数 = " + ret3); //1

        int ret4 = basicMethods.getHeight(root);
        System.out.println("二叉树的高度 = " + ret4); //4

        TreeNode p = basicMethods.find(root,'B');
        System.out.println("值为val的结点= " + p.val);  // B

        boolean flag = basicMethods.isBalanced(root);
        System.out.println(flag); //true

        /**
         * Leetcode
         */
        Leetcode leetcode = new Leetcode();
        boolean flag1 = leetcode.isSameTree(root,root);
        System.out.println(flag1); //true

        boolean flag2 = leetcode.isSubTree(root,root);
        System.out.println(flag2); //true

        boolean flag3 = leetcode.isSymmetric(root);
        System.out.println(flag3); //false

    }
}
