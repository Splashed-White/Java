/**
 * Created with IntelliJ IDEA.
 * Description:二叉树的基本方法
 * User: TL
 * Date: 2021-07-20
 * Time: 17:23
 */
public class BasicMethods {
    // 求结点个数_遍历思路  (前序遍历)
    static int size = 0;
    void getSize1(TreeNode root) {
        if(root == null) return;
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 求结点个数_子问题思路
    int getSize2(TreeNode root){
        if(root == null) return 0;
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    // 求叶子结点个数_遍历思路
    //遍历这颗二叉树，只要节点的左子树和右子树都是空的，那么就是叶子节点
    static int leafSize = 0;
    void getLeafSize1(TreeNode root){
        if(root== null) return;
        if(root.left == null && root.right == null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 求叶子结点个数_子问题思路
    //整颗树的叶子节点 = 左子树叶子 + 右子树叶子
    int getLeafSize2(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 求第 k 层结点个数_子问题思路
    int getKLevelSize(TreeNode root,int k){
        if(root == null) return 0;
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

    // 获取二叉树的高度
    //root高度 = 左树高度 和 右树高度 ，求最大值，再+1
    int getHeight(TreeNode root){
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

    /**
     * 查找 val 所在结点，没有找到返回 null
     * 按照 根 -> 左子树 -> 右子树的顺序进行查找
     * 一旦找到，立即返回，不需要继续在其他位置查找
     * @param root
     * @param val
     * @return
     */
    TreeNode find(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        TreeNode temp = find(root.left,val);
        if(temp != null){
            return temp;
        }
        temp = find(root.right,val);
        if(temp != null){
            return temp;
        }
        return null;
    }

    /**
     * 判断一棵树是否为平衡二叉树
     * 一个二叉树每个节点的左右两个子树的高度差的绝对值不超过 1
     * @param root
     * @return
     */
    boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1){
            /*
            只要当前根的左树 或者右树 不满足
            leftHeight == -1 || rightHeight==-1
            就不会进入if语句
        */
            return (isBalanced(root.left) && isBalanced(root.right));
        }else{
            //当前节点已失衡
            return false;
        }
    }

}
