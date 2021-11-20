/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-06-08
 * Time: 23:42
 */

public class TestDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        int hight = binaryTree.getHeight(root);
        System.out.println(hight);


       /* binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);

        System.out.println(binaryTree.getLeafSize2(root));

        System.out.println("==================");
        System.out.println(binaryTree.getKLevelSize(root,3));
        System.out.println("===============");

        TreeNode ret = binaryTree.find(root,'F');

        System.out.println(ret.val);*/
        /*binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);
        System.out.println("=================");
        System.out.println(binaryTree.getSize2(root));*/
    }
}
